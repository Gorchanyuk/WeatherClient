package com.gorchanyuk.weatherclient.service;

import com.gorchanyuk.weatherclient.dto.CityDTO;
import com.gorchanyuk.weatherclient.model.City;

import java.util.List;

public interface CityService {

    public List<City> getCities();

    public City updateCity(Long id, CityDTO coordDTO);
}
