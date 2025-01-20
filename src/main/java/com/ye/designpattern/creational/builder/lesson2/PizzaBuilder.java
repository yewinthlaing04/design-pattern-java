package com.ye.designpattern.creational.builder.lesson2;

import java.util.ArrayList;

public interface PizzaBuilder {
    void reset();
    void setName(String name);
    void addSauce(String sauce );
    void setSize(String size );
    void setCrust(String crust ) ;
    void addToppings(String topping);
}
