package com.saurabh.weatherforecast.controller;

import com.saurabh.weatherforecast.model.WeatherResponse;
import com.saurabh.weatherforecast.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping("/weather")
    public String getWeather(@RequestParam String city, Model model) {

        WeatherResponse weather = weatherService.getWeather(city);

        model.addAttribute("weather", weather);

        return "weather";
    }
}