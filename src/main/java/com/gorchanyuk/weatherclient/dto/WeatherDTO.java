package com.gorchanyuk.weatherclient.dto;

import com.gorchanyuk.weatherclient.dto.common.MainDTO;
import com.gorchanyuk.weatherclient.dto.common.WindDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WeatherDTO {

    private MainDTO main; //Температура и давление
    private WindDTO wind; //Ветер
}
