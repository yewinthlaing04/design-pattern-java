package com.ye.designpattern.creational.abstractfactory.lesson1.button;

public class MacOsButton implements Button{
    @Override
    public void buttonClick() {
        System.out.println("Mac Os Button Click");
    }

    @Override
    public void printClick() {
        System.out.println("Mac OS Button");
    }
}
