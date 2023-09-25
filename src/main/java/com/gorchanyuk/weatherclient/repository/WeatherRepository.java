package com.gorchanyuk.weatherclient.repository;

import com.gorchanyuk.weatherclient.model.Weather;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeatherRepository extends JpaRepository<Weather, Long> {
}
