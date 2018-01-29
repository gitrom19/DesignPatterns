package com.grorom.patterns.factory.method;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza1 = nyStore.orderPizza(PizzaType.NY_STYLE_CHEESE_PIZZA);
        System.out.println("Customer 1 ordered a " + pizza1.getName());
        Pizza pizza2 = chicagoStore.orderPizza(PizzaType.CHICAGO_STYLE_CHEESE_PIZZA);
        System.out.println("Customer 2 ordered a " + pizza2.getName());
    }
}
