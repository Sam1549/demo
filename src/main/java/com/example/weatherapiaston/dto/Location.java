package com.example.weatherapiaston.dto;


import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Location {
    private String name;
    private String region;
    private String country;
    private double lat;
    private double lon;
    @SerializedName("tz_id")
    private String timeZoneId;
    @SerializedName("localtime_epoch")
    private long localTimeEpoch;
    private String localtime;
}
