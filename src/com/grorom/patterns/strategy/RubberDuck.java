package com.grorom.patterns.strategy;

import com.grorom.patterns.strategy.behaviours.FlyNoWay;
import com.grorom.patterns.strategy.behaviours.Squeak;

public class RubberDuck extends Duck {
    public RubberDuck() {
        setFlyBehaviour(new FlyNoWay());
        setQuackBehaviour(new Squeak());
    }
    @Override
    public void display() {
        System.out.println("Look what this duck does: " + this.getClass().getName());
        this.performFly();
        this.performQuack();
    }
}
