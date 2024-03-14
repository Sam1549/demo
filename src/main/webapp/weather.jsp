<%--
  Created by IntelliJ IDEA.
  User: Sam1549
  Date: 3/13/2024
  Time: 11:18 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Weather Forecast</title>
</head>
<body>
<h1>Weather Forecast</h1>
<form action="/weather" method="get">
  <label for="city">Enter city:</label>
  <input type="text" id="city" name="city">
  <button type="submit">Get Weather</button>
</form>
<br>
<c:if test="${not empty errorMessage}">
  <p>${errorMessage}</p>
</c:if>
<c:if test="${not empty weatherData}">
  <h2>${weatherData.location.name}, ${weatherData.location.country}</h2>
  <p>Local Time: ${weatherData.location.localtime}</p>
  <p>Temperature: ${weatherData.current.temperatureCelsius}°C</p>
  <p>Condition: ${weatherData.current.condition.text}</p>
</c:if>
</body>
</html>

