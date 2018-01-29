package com.grorom.patterns.strategy.behaviours;

public class Squeak implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Quack: SQUEAK!!!");
    }
}
