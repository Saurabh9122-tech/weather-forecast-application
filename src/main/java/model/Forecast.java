package com.saurabh.weatherforecast.model;

import lombok.Data;

@Data
public class Forecast {

    private String date;
    private double temperature;
    private String description;

}