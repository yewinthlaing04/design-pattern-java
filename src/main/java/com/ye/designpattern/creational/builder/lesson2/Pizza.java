package com.ye.designpattern.creational.builder.lesson2;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

    private String name = "Pizza";
    private String size ;
    private String sauce ;
    private List<String> toppings;
    private String crust ;

    public Pizza(){
        this.toppings = new ArrayList<String>();
    }

    public void setName(String name){
        this.name = name ;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void setToppings(String topping) {
        this.toppings.add(topping); // Safe to call because toppings is now initialized
    }

    public void setCrust(String crust) {
        this.crust = crust;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", sauce='" + sauce + '\'' +
                ", toppings=" + toppings +
                ", crust='" + crust + '\'' +
                '}';
    }
}
