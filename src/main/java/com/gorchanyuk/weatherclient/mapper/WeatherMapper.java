package com.gorchanyuk.weatherclient.mapper;

import com.gorchanyuk.weatherclient.dto.WeatherDTO;
import com.gorchanyuk.weatherclient.model.Weather;


public interface WeatherMapper {

    Weather dtoToModel(WeatherDTO dto);
}
