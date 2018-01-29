package com.grorom.patterns.observer;

import java.util.Observer;

public interface Subject {
    void registerObserver(WeatherObserver observer);
    void removeObserver(WeatherObserver observer);
    void notifyObservers();
}
