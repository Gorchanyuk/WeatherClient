package com.gorchanyuk.weatherclient.dto.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MainDTO {

    private Double temp; //Температура
    private Integer pressure; //Атмосферное давление на уровне моря, гПа
}
