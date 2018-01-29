package com.grorom.patterns.strategy;

import com.grorom.patterns.strategy.behaviours.FlyBehaviour;
import com.grorom.patterns.strategy.behaviours.QuackBehaviour;

public abstract class Duck {
    private FlyBehaviour flyBehaviour;
    private QuackBehaviour quackBehaviour;

    public void swim() {
        System.out.println("Swimming...");
    }

    public void performQuack() {
        quackBehaviour.quack();
    }

    public void performFly() {
        flyBehaviour.fly();
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    public abstract void display();

 }
