package com.gorchanyuk.weatherclient.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CityDTO {

    private String name; //Название города
    private Double lat; //Широта местоположения
    private Double lon; //Долгота местоположения
    private String state; //Страна !!!МОЖЕТ ОКАЗАТЬСЯ ПУСТОЙ!!!
}
