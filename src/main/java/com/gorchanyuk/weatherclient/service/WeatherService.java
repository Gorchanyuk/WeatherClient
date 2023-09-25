package com.gorchanyuk.weatherclient.service;

import com.gorchanyuk.weatherclient.model.Weather;

import java.util.List;

public interface WeatherService {

    void saveAll(List<Weather> listWeather);
}
