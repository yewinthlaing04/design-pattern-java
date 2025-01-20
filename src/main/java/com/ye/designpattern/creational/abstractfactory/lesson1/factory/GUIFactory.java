package com.ye.designpattern.creational.abstractfactory.lesson1.factory;

import com.ye.designpattern.creational.abstractfactory.lesson1.button.Button;
import com.ye.designpattern.creational.abstractfactory.lesson1.checkbox.CheckBox;

public interface GUIFactory {

     Button createButton();

     CheckBox createCheckBox();
}
