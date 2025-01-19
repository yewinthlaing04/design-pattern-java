package com.ye.designpattern.creational.singleton;

public class SingleThreadDemo {

    public static void main(String[] args) {

        Singleton singleton =  Singleton.getInstance("Hello");
        Singleton newSingleton =  Singleton.getInstance("Hi");
        Singleton thirdSingleton = Singleton.getInstance("Next String");

        System.out.println(singleton.value);  // output hello
        System.out.println(newSingleton.value); // output hello
        System.out.println(thirdSingleton.value); // output hello
    }
}
