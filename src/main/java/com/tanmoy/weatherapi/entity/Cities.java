package com.tanmoy.weatherapi.entity;

import jakarta.persistence.*;

@Entity
@Table
public class Cities {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cityId;

    private String cityName;
    private double latitude;
    private double longitude;
    private String countryName;

}
