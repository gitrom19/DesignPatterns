package com.grorom.patterns.strategy;

import com.grorom.patterns.strategy.behaviours.FlyWithWings;

public class Main {

    public static void main(String[] args) {

        System.out.println("Duck Simulator started");
        Duck mallardDuck = new MallardDuck();
        Duck rubberDuck = new RubberDuck();
        Duck decoyDuck = new DecoyDuck();

        mallardDuck.display();
        rubberDuck.display();
        decoyDuck.display();

        rubberDuck.setFlyBehaviour(new FlyWithWings());
        rubberDuck.display();
    }
}
