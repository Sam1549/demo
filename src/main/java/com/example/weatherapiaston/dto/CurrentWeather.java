package com.example.weatherapiaston.dto;

import com.google.gson.annotations.SerializedName;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
public class CurrentWeather {
    @SerializedName("last_updated_epoch")
    private long lastUpdatedEpoch;
    @SerializedName("last_updated")
    private String lastUpdated;
    @SerializedName("temp_c")
    private double temperatureCelsius;
    @SerializedName("temp_f")
    private double temperatureFahrenheit;
    @SerializedName("is_day")
    private int isDay;
    private Condition condition;
    @SerializedName("wind_mph")
    private double windMph;
    @SerializedName("wind_kph")
    private double windKph;
    @SerializedName("wind_degree")
    private int windDegree;
    @SerializedName("wind_dir")
    private String windDirection;
    @SerializedName("pressure_mb")
    private double pressureMb;
    @SerializedName("pressure_in")
    private double pressureIn;
    @SerializedName("precip_mm")
    private double precipMm;
    @SerializedName("precip_in")
    private double precipIn;
    private int humidity;
    private int cloud;
    @SerializedName("feelslike_c")
    private double feelsLikeCelsius;
    @SerializedName("feelslike_f")
    private double feelsLikeFahrenheit;
    @SerializedName("vis_km")
    private double visibilityKm;
    @SerializedName("vis_miles")
    private double visibilityMiles;
    private double uv;
    @SerializedName("gust_mph")
    private double gustMph;
    @SerializedName("gust_kph")
    private double gustKph;

}
