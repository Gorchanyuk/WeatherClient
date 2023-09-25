package com.gorchanyuk.weatherclient.mapper.impl;

import com.gorchanyuk.weatherclient.dto.CityDTO;
import com.gorchanyuk.weatherclient.mapper.CityMapper;
import com.gorchanyuk.weatherclient.model.City;
import org.springframework.stereotype.Component;

@Component
public class CityMapperImpl implements CityMapper {
    @Override
    public void dtoToModel(City city, CityDTO dto) {
        city.setLat(dto.getLat());
        city.setLon(dto.getLon());
    }
}
