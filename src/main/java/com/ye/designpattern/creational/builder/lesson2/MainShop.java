package com.ye.designpattern.creational.builder.lesson2;

public class MainShop {

    public static void main(String[] args) {
        Director director = new Director();
        PizzaConcreteBuilder builder = new PizzaConcreteBuilder();

        director.buildItalianPizza(builder);
        Pizza italianPizza = builder.getResult();
        System.out.println(italianPizza.toString());
    }
}
