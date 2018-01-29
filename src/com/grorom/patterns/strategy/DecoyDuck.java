package com.grorom.patterns.strategy;

import com.grorom.patterns.strategy.behaviours.FlyNoWay;
import com.grorom.patterns.strategy.behaviours.Mute;

public class DecoyDuck extends Duck {
    public DecoyDuck() {
        setFlyBehaviour(new FlyNoWay());
        setQuackBehaviour(new Mute());
    }

    @Override
    public void display() {
        System.out.println("Look what this duck does: " + this.getClass().getName());
        this.performFly();
        this.performQuack();
    }
}
