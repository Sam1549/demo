package com.example.weatherapiaston;

import com.example.weatherapiaston.api.WeatherApiClient;
import com.example.weatherapiaston.api.WeatherApiClientImpl;
import com.example.weatherapiaston.dto.WeatherData;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "weatherServlet", value = "/weather")
public class WeatherServlet extends HttpServlet {
    private final WeatherApiClient weatherApiClient;
    private static final String API_KEY = "7a4e49129ef74affb8b222755240903";
    private static final String API_URL = "https://api.weatherapi.com/v1/current.json?key=%s&q=%s";

    public WeatherServlet() {
        weatherApiClient = new WeatherApiClientImpl();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        String city = request.getParameter("city");

        if (city != null && !city.isEmpty()) {
            String apiUrl = String.format(API_URL, API_KEY, city);
            try {
                WeatherData weatherData = weatherApiClient.sendGetRequest(apiUrl);

                request.setAttribute("weatherData", weatherData);
            } catch (IOException e) {
                request.setAttribute("errorMessage", "Failed to retrieve weather data");
            }
            request.getRequestDispatcher("/weather.jsp").forward(request, response);
        }




    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
