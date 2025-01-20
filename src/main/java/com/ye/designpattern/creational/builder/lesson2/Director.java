package com.ye.designpattern.creational.builder.lesson2;

public class Director {

    public void buildItalianPizza( PizzaBuilder builder ) {
        builder.reset(); // create a new instance
        builder.setName("Italian Pizza");
        builder.addSauce("Tomato");
        builder.addToppings("Cheese");
        builder.setSize("Medium");

    }

}
