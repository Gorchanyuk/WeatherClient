package com.gorchanyuk.weatherclient.mapper.impl;

import com.gorchanyuk.weatherclient.dto.WeatherDTO;
import com.gorchanyuk.weatherclient.mapper.WeatherMapper;
import com.gorchanyuk.weatherclient.model.Weather;
import org.springframework.stereotype.Component;

@Component
public class WeatherMapperImpl implements WeatherMapper {
    @Override
    public Weather dtoToModel(WeatherDTO dto) {
        return Weather.builder()
                .temp(dto.getMain().getTemp())
                .pressure(dto.getMain().getPressure())
                .speed(dto.getWind().getSpeed())
                .gust(dto.getWind().getGust())
                .build();
    }
}
