package com.grorom.patterns.decorator;

public abstract class Beverage {

    final String description;

    public Beverage() {
        this("Unknown Beverage");
    }
    public Beverage(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    abstract float cost();
}
