package com.grorom.patterns.observer;

public interface WeatherObserver {
    void update(float temperature, float humidity, float pressure);
}
