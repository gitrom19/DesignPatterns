package com.grorom.patterns.strategy.behaviours;

public interface FlyBehaviour {
    default void fly(){
        System.out.println("Fly: default");
    }
}
