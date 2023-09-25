package com.gorchanyuk.weatherclient.dto.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WindDTO {

    private Double speed; //Скорость ветра
    private Double gust; //Порыв ветра

}
