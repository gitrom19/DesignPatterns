package com.grorom.patterns.observer;

public class CurrentConditionsDisplay implements WeatherObserver, DisplayElement {
    private float temperature;
    private float pressure;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current Weather: Temp=" + this.temperature + " Humidity=" + this.humidity + " Pressure=" + this.pressure);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
