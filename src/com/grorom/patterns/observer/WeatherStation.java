package com.grorom.patterns.observer;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(25.3F, 75.25F, 24.4F);
        weatherData.setMeasurements(20.0F, 50.6F, 20.0F);
    }
}
