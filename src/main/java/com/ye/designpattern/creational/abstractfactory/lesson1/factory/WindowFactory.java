package com.ye.designpattern.creational.abstractfactory.lesson1.factory;

import com.ye.designpattern.creational.abstractfactory.lesson1.button.Button;
import com.ye.designpattern.creational.abstractfactory.lesson1.button.WindowButton;
import com.ye.designpattern.creational.abstractfactory.lesson1.checkbox.CheckBox;
import com.ye.designpattern.creational.abstractfactory.lesson1.checkbox.WindowCheckBox;

public class WindowFactory implements GUIFactory{

    @Override
    public Button createButton() {
        return new WindowButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowCheckBox();
    }
}
