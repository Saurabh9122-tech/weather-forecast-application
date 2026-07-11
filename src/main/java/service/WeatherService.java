package com.saurabh.weatherforecast.service;

import org.springframework.stereotype.Service;

@Service
public class WeatherService {

    public String getWelcomeMessage() {
        return "Weather Service is Ready!";
    }
}