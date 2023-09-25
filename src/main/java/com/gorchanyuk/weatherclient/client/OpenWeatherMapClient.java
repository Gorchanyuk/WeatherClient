package com.gorchanyuk.weatherclient.client;

import com.gorchanyuk.weatherclient.dto.CityDTO;
import com.gorchanyuk.weatherclient.dto.WeatherDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "client", url = "https://api.openweathermap.org")
public interface OpenWeatherMapClient {

    @GetMapping("/data/2.5/weather")
    WeatherDTO getWeatherByCoord(@RequestParam(value = "lat") double latitude,
                                @RequestParam(value = "lon") double longitude,
                                @RequestParam(value = "appid") String key,
                                @RequestParam(value = "units") String units);

    @GetMapping("/geo/1.0/direct")
    List<CityDTO> getWeatherByName(@RequestParam(value = "q") String name,
                                   @RequestParam(value = "appid") String key);
}
