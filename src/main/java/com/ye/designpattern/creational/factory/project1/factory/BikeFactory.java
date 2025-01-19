package com.ye.designpattern.creational.factory.project1.factory;

import com.ye.designpattern.creational.factory.project1.vehicule.Bike;
import com.ye.designpattern.creational.factory.project1.vehicule.Vehicule;

public class BikeFactory extends VehiculeFactory{
    @Override
    public Vehicule createVehicule() {
        return new Bike();
    }
}
