package com.ye.designpattern.creational.factory.project1.factory;

import com.ye.designpattern.creational.factory.project1.vehicule.Car;
import com.ye.designpattern.creational.factory.project1.vehicule.Vehicule;

public class CarFactory extends VehiculeFactory{
    @Override
    public Vehicule createVehicule() {
        return new Car();
    }
}
