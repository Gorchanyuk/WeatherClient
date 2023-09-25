package com.gorchanyuk.weatherclient.service.impl;

import com.gorchanyuk.weatherclient.dto.CityDTO;
import com.gorchanyuk.weatherclient.mapper.CityMapper;
import com.gorchanyuk.weatherclient.model.City;
import com.gorchanyuk.weatherclient.repository.CityRepository;
import com.gorchanyuk.weatherclient.service.CityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CityServiceImpl implements CityService {

    private final CityRepository cityRepository;
    private final CityMapper cityMapper;

    @Transactional
    public List<City> getCities(){
        return cityRepository.findAll();
    }

    @Override
    public City updateCity(Long id, CityDTO coordDTO) {
        City city = cityRepository.findById(id).get();

        cityMapper.dtoToModel(city, coordDTO);
        cityRepository.save(city);
        return city;
    }


}

