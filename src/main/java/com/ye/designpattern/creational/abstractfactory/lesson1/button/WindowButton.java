package com.ye.designpattern.creational.abstractfactory.lesson1.button;

public class WindowButton implements Button{
    @Override
    public void buttonClick() {
        System.out.println("Window Button");
    }

    @Override
    public void printClick() {
        System.out.println("Window Button Click");
    }
}
