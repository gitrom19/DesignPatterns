package com.grorom.patterns.strategy.behaviours;

public class FlyWithWings implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("Fly: With wings!");
    }
}
