package com.gorchanyuk.weatherclient.repository;

import com.gorchanyuk.weatherclient.model.City;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {

    @Override
    @NonNull
    @EntityGraph(value = "city_country", type = EntityGraph.EntityGraphType.LOAD)
    List<City> findAll();
}
