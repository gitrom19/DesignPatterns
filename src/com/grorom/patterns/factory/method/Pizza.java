package com.grorom.patterns.factory.method;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    String dough;
    String name;
    String sauce;
    List<String> toppings = new ArrayList<>();

    public Pizza() {
        name = this.getClass().getName();
    }

    public void prepare() {
        System.out.println("Preparing " + getName());
        System.out.println("Tossing dough " + dough);
        System.out.println("Adding sauce..." + sauce);
        System.out.println("Adding toppings: ");
        for (String topping : toppings){
            System.out.println("   " + topping);
        }
    }
    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting into diagonal slices");
    }

    public void box() {
        System.out.println("Boxing in official PizzaStore box");
    }

    public String getName() {
        return this.name;
    }
}
