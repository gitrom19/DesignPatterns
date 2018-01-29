package com.grorom.patterns.decorator;

public class Whip extends CondimentDecorator {
    Beverage beverage;
    public Whip(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + "\n   and Whip";
    }

    @Override
    float cost() {
        return beverage.cost() + 0.6F;
    }
}
