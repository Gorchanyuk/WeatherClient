package com.gorchanyuk.weatherclient.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "weather")
public class Weather {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "my_weather_id_seq")
    @SequenceGenerator(name = "my_weather_id_seq", initialValue = 1, allocationSize = 50)
    private Long id;  //Уникальный идентификатор

    @ManyToOne
    @JoinColumn(name = "city_id", nullable = false)
    private City cityId; //Город

    @Column(name = "date_time")
    private LocalDateTime dateTime; //Время получения данных

    @Column(name = "temperature")
    private Double temp; //Температура

    @Column(name = "pressure")
    private Integer pressure; //Атмосферное давление на уровне моря, гПа

    @Column(name = "wind_speed")
    private Double speed; //Скорость ветра

    @Column(name = "wind_gust")
    private Double gust; //Порывы ветра
}
