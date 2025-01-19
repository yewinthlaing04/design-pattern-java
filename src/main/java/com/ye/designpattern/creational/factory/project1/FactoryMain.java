package com.ye.designpattern.creational.factory.project1;

import com.ye.designpattern.creational.factory.project1.factory.CarFactory;
import com.ye.designpattern.creational.factory.project1.factory.VehiculeFactory;
import com.ye.designpattern.creational.factory.project1.vehicule.Vehicule;

public class FactoryMain {
    public static void main(String[] args) {
        VehiculeFactory carfactory = new CarFactory();
        Vehicule car = carfactory.createVehicule();
        car.drive();
    }
}
