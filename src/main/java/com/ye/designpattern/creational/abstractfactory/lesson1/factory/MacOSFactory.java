package com.ye.designpattern.creational.abstractfactory.lesson1.factory;

import com.ye.designpattern.creational.abstractfactory.lesson1.button.Button;
import com.ye.designpattern.creational.abstractfactory.lesson1.button.MacOsButton;
import com.ye.designpattern.creational.abstractfactory.lesson1.checkbox.CheckBox;
import com.ye.designpattern.creational.abstractfactory.lesson1.checkbox.MacCheckBox;

public class MacOSFactory implements GUIFactory{

    @Override
    public Button createButton() {
        return new MacOsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacCheckBox();
    }
}
