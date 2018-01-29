package com.grorom.patterns.factory.method;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(PizzaType pizzaType) {
        if (pizzaType == PizzaType.CHICAGO_STYLE_CHEESE_PIZZA) {
            return new ChicagoStyleCheesePizza();
        }
        return new Margarita();
    }
}
