package com.ye.designpattern.creational.abstractfactory.lesson1;

import com.ye.designpattern.creational.abstractfactory.lesson1.button.Button;
import com.ye.designpattern.creational.abstractfactory.lesson1.checkbox.CheckBox;
import com.ye.designpattern.creational.abstractfactory.lesson1.factory.GUIFactory;

public class Application {

    private Button button;
    private CheckBox checkBox;

    public Application(GUIFactory guiFactory) {
        this.button = guiFactory.createButton() ;
        this.checkBox = guiFactory.createCheckBox() ;
    }

    public void appFunction(){
        button.printClick();
        checkBox.clickCheckBox();
    }
}
