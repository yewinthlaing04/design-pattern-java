package com.ye.designpattern.creational.abstractfactory.lesson1.checkbox;

public class WindowCheckBox implements CheckBox{

    @Override
    public void clickCheckBox() {
        System.out.println("Window CheckBox");
    }
}
