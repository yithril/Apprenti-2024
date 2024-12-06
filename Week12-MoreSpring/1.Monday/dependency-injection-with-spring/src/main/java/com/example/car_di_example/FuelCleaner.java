package com.example.car_di_example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FuelCleaner {
    private final OilFilter oilFilter;
    private final FuelSensor fuelSensor;

    @Autowired
    public FuelCleaner(OilFilter oilFilter, FuelSensor fuelSensor) {
        this.oilFilter = oilFilter;
        this.fuelSensor = fuelSensor;
    }

    public void cleanFuelSystem() {
        oilFilter.filter();
        System.out.println("Cleaning fuel system.");
    }
}
