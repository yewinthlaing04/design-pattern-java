package com.ye.designpattern.creational.builder.lesson2;

import java.util.ArrayList;

public class PizzaConcreteBuilder implements PizzaBuilder{

    private Pizza pizza;

    public PizzaConcreteBuilder(){
        this.reset();
    }

    @Override
    public void reset() {
        this.pizza = new Pizza();
    }

    @Override
    public void setName(String name) {
        this.pizza.setName(name);
    }

    @Override
    public void addSauce(String sauce) {
        this.pizza.setSauce(sauce);
    }

    @Override
    public void setSize(String size) {
        this.pizza.setSize(size);
    }

    @Override
    public void setCrust(String crust) {
        this.pizza.setCrust(crust);
    }

    @Override
    public void addToppings(String topping) {
        this.pizza.setToppings(topping);
    }

    public Pizza getResult(){
        return this.pizza;
    }
}
