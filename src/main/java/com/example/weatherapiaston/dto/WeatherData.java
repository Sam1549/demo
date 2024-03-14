package com.example.weatherapiaston.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
public class WeatherData {
    private Location location;
    private CurrentWeather current;
}






