package com.example.weatherapiaston.api;



import com.example.weatherapiaston.dto.WeatherData;

import java.io.IOException;


public interface WeatherApiClient {
    WeatherData sendGetRequest(String apiUrl) throws IOException;

}
