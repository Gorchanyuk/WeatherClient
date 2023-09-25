package com.gorchanyuk.weatherclient.service.impl;

import com.gorchanyuk.weatherclient.model.Weather;
import com.gorchanyuk.weatherclient.repository.WeatherRepository;
import com.gorchanyuk.weatherclient.service.WeatherService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class WeatherServiceImpl implements WeatherService {

    private final WeatherRepository weatherRepository;

    @Override
    @Transactional
    public void saveAll(List<Weather> listWeather) {
        listWeather.forEach(w->w.setDateTime(LocalDateTime.now()));
        weatherRepository.saveAll(listWeather);
    }
}
