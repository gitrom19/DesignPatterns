package com.grorom.patterns.strategy.behaviours;

public class Mute implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Quack: Silence...");
    }
}
