package com.grorom.patterns.strategy.behaviours;

public interface QuackBehaviour {
    default void quack() {
        System.out.println("Quack default");
    }
}
