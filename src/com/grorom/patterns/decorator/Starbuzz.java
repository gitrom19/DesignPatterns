package com.grorom.patterns.decorator;

public class Starbuzz {

    public static void main(String[] args){
        Beverage fancyBev = new Whip(new Milk(new HouseBlend()));
        System.out.println(fancyBev.getDescription());
        System.out.println(fancyBev.cost());

        Beverage espresso = new Espresso();
        espresso = new Milk(espresso);
        System.out.println(espresso.getDescription());
        System.out.println(espresso.cost());
    }
}
