package com.ye.designpattern.creational.abstractfactory.lesson1;

import com.ye.designpattern.creational.abstractfactory.lesson1.button.Button;
import com.ye.designpattern.creational.abstractfactory.lesson1.button.WindowButton;
import com.ye.designpattern.creational.abstractfactory.lesson1.factory.GUIFactory;
import com.ye.designpattern.creational.abstractfactory.lesson1.factory.MacOSFactory;
import com.ye.designpattern.creational.abstractfactory.lesson1.factory.WindowFactory;

public class Main {


    public static void main(String[] args) {
        GUIFactory macFactory = new MacOSFactory();

        GUIFactory windowFactory = new WindowFactory();

        Application macApp = new Application(macFactory);
        macApp.appFunction();
        Application windowApp = new Application(windowFactory);
        windowApp.appFunction();


    }

}
