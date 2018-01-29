package com.grorom.patterns.decorator;

public class Milk extends CondimentDecorator {
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    float cost() {
        return beverage.cost() + 0.3F;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "\n   and Milk";
    }
}
