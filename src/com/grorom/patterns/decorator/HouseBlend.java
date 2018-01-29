package com.grorom.patterns.decorator;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        super("HouseBlend");
    }

    @Override
    float cost() {
        return 3.4F;
    }
}
