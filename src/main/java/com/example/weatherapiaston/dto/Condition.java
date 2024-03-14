package com.example.weatherapiaston.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
public class Condition {
    private String text;
    private String icon;
    private int code;


}
