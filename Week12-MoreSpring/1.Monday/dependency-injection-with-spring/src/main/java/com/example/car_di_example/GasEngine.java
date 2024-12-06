package com.example.car_di_example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//So there are multiple things that implement Engine, this is the default one because of the
//@Primary annotation
@Component
@Primary
public class GasEngine implements Engine {
    private final FuelCleaner cleaner;

    @Autowired
    public GasEngine(FuelCleaner cleaner) {
        this.cleaner = cleaner;
    }

    @Override
    public void start() {
        System.out.println("Gasoline engine started.");
    }

    @Override
    public void performMaintenance() {
        cleaner.cleanFuelSystem();
        System.out.println("Maintaining gasoline engine.");
    }
}
