package com.grorom.patterns.factory.method;

public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(PizzaType pizzaType) {
        if (pizzaType == PizzaType.NY_STYLE_CHEESE_PIZZA) {
            return new NYStyleCheesePizza();
        }

        return new Margarita();
    }
}
