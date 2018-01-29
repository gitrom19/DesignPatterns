package com.grorom.patterns.strategy;

import com.grorom.patterns.strategy.behaviours.FlyWithWings;
import com.grorom.patterns.strategy.behaviours.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        setFlyBehaviour(new FlyWithWings());
        setQuackBehaviour(new Quack());
    }
    @Override
    public void display() {
        System.out.println("Look what this duck does: " + this.getClass().getName());
        this.performFly();
        this.performQuack();
    }

}
