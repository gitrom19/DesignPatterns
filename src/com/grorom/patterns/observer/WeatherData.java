package com.grorom.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    List<WeatherObserver> observerList = new ArrayList<>();
    float temperature;
    float humidity;
    float pressure;

    @Override
    public void registerObserver(WeatherObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(WeatherObserver observer) {
        observerList.remove(observer);
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        for (WeatherObserver observer : observerList) {
            observer.update(temperature, humidity, pressure);
        }
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
