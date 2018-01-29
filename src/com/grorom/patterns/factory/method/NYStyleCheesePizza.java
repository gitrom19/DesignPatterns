package com.grorom.patterns.factory.method;

public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        super();
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Grated Reggiano Cheese");
    }
}
