package com.saurabh.weatherforecast.service;

import com.saurabh.weatherforecast.model.WeatherResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class WeatherService {

    @Value("${weather.api.key}")
    private String apiKey;

    private final RestTemplate restTemplate;

    public WeatherService(RestTemplateBuilder builder) {
        this.restTemplate = builder.build();
    }

    public WeatherResponse getWeather(String city) {

        String url = "https://api.openweathermap.org/data/2.5/weather?q="
                + city
                + "&appid="
                + apiKey
                + "&units=metric";

        Map<String, Object> response = restTemplate.getForObject(url, Map.class);

        WeatherResponse weather = new WeatherResponse();

        weather.setCity((String) response.get("name"));

        Map<String, Object> main = (Map<String, Object>) response.get("main");

        weather.setTemperature(
                ((Number) main.get("temp")).doubleValue());

        weather.setHumidity(
                ((Number) main.get("humidity")).intValue());

        Map<String, Object> wind = (Map<String, Object>) response.get("wind");

        weather.setWindSpeed(
                ((Number) wind.get("speed")).doubleValue());

        java.util.List<Map<String, Object>> weatherList =
                (java.util.List<Map<String, Object>>) response.get("weather");

        weather.setDescription(
                (String) weatherList.get(0).get("description"));

        return weather;
    }
}