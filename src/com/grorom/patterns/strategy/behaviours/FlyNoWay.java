package com.grorom.patterns.strategy.behaviours;

public class FlyNoWay implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("Fly: No way!");
    }
}
