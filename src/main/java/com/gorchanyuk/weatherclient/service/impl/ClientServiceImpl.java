package com.gorchanyuk.weatherclient.service.impl;

import com.gorchanyuk.weatherclient.props.OpenWeatherMapProperty;
import com.gorchanyuk.weatherclient.client.OpenWeatherMapClient;
import com.gorchanyuk.weatherclient.dto.CityDTO;
import com.gorchanyuk.weatherclient.dto.WeatherDTO;
import com.gorchanyuk.weatherclient.mapper.WeatherMapper;
import com.gorchanyuk.weatherclient.model.City;
import com.gorchanyuk.weatherclient.model.Weather;
import com.gorchanyuk.weatherclient.service.CityService;
import com.gorchanyuk.weatherclient.service.ClientService;
import com.gorchanyuk.weatherclient.service.WeatherService;
import feign.FeignException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ClientServiceImpl implements ClientService {

    private final CityService cityService;
    private final WeatherService weatherService;
    private final OpenWeatherMapClient client;
    private final OpenWeatherMapProperty property;
    private final WeatherMapper mapper;

    @Override
    @Scheduled(cron = "${interval-weather-loading}")
    public void getWeatherInCity() {
        List<City> cities = cityService.getCities();
        List<Weather> listWeather = new ArrayList<>();
        for (City city : cities) {
            if (city.getLon() == null || city.getLat() == null) {
                city = getCity(city);
                if(ObjectUtils.isEmpty(city)){
                    continue;
                }
            }
            Weather weather;
            try {
                weather = getWeather(city);
            }catch (FeignException e){
                continue;
            }
            listWeather.add(weather);
        }
        weatherService.saveAll(listWeather);
    }

    private Weather getWeather(City city) throws FeignException {
        WeatherDTO weatherDTO;
        try {
            weatherDTO =
                    client.getWeatherByCoord(city.getLat(), city.getLon(), property.getKey(), property.getUnits());
        }catch (FeignException e){
            //TODO Нужно оповестить о проблеме в запросе
            log.warn("Error when accessing a remote server: {}", e.getMessage());
            throw e;
        }

        Weather weather = mapper.dtoToModel(weatherDTO);
        weather.setCityId(city);
        return weather;
    }

    private City getCity(City city) throws FeignException{
        List<CityDTO> listCities = client
                .getWeatherByName(city.getName() + "," + city.getCountryId().getName(), property.getKey());
        if (listCities.isEmpty()){
            //TODO Нужно оповестить о неверной записи в БД
            log.warn("Unsuccessful attempt to obtain coordinates for a city: {}", city.getName());
            return null;
        }
        CityDTO cityDTO = listCities.get(0);
        city = cityService.updateCity(city.getId(), cityDTO);
        return city;
    }

}
