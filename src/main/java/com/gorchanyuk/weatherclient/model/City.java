package com.gorchanyuk.weatherclient.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "city")
@NamedEntityGraph(
        name = "city_country",
        attributeNodes = {
                @NamedAttributeNode("countryId")
        })
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;  //Уникальный идентификатор

    @Column(name = "name")
    private String name; //Название города

    @ManyToOne
    @JoinColumn(name = "country_id", nullable = false)
    private Country countryId; //Страна в которой находится город

    @Column(name = "latitude")
    private Double lat; //Широта местоположения

    @Column(name = "longitude")
    private Double lon; //Долгота местоположения
}
