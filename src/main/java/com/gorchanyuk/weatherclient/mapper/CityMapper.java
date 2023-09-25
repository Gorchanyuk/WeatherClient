package com.gorchanyuk.weatherclient.mapper;

import com.gorchanyuk.weatherclient.dto.CityDTO;
import com.gorchanyuk.weatherclient.model.City;

public interface CityMapper {

    void dtoToModel(City city, CityDTO dto);
}
