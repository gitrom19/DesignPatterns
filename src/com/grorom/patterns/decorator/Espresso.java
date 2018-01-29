package com.grorom.patterns.decorator;

public class Espresso extends Beverage {
    public Espresso () {
        super("Espresso");
    }

    @Override
    float cost() {
        return 2.7F;
    }
}
