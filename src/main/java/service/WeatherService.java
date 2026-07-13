package com.saurabh.weatherforecast.service;

import com.saurabh.weatherforecast.model.WeatherResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;

@Service
public class WeatherService {

    @Value("${weather.api.key}")
    private String apiKey;

    private final RestTemplate restTemplate = new RestTemplate();

    public WeatherResponse getWeather(String city) {

        String url = "https://api.openweathermap.org/data/2.5/weather?q="
                + city
                + "&appid="
                + apiKey
                + "&units=metric";

        Map<String, Object> response = restTemplate.getForObject(url, Map.class);

        WeatherResponse weather = new WeatherResponse();

        // City Name
        weather.setCity((String) response.get("name"));

        // Main Weather Information
        Map<String, Object> main = (Map<String, Object>) response.get("main");

        weather.setTemperature(((Number) main.get("temp")).doubleValue());

        weather.setFeelsLike(((Number) main.get("feels_like")).doubleValue());

        weather.setMinTemp(((Number) main.get("temp_min")).doubleValue());

        weather.setMaxTemp(((Number) main.get("temp_max")).doubleValue());

        weather.setHumidity(((Number) main.get("humidity")).intValue());

        weather.setPressure(((Number) main.get("pressure")).intValue());

        // Wind Information
        Map<String, Object> wind = (Map<String, Object>) response.get("wind");

        weather.setWindSpeed(((Number) wind.get("speed")).doubleValue());

        // Weather Description
        List<Map<String, Object>> weatherList =
                (List<Map<String, Object>>) response.get("weather");

        weather.setDescription((String) weatherList.get(0).get("description"));

        weather.setIcon((String) weatherList.get(0).get("icon"));

        return weather;
    }
}