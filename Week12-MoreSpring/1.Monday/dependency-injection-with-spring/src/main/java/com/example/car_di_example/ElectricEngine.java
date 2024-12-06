package com.example.car_di_example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ElectricEngine implements Engine {
    private final BatteryChecker checker;

    @Autowired
    public ElectricEngine(BatteryChecker checker) {
        this.checker = checker;
    }

    @Override
    public void start() {
        System.out.println("Electric engine started.");
    }

    @Override
    public void performMaintenance() {
        checker.checkBattery();
        System.out.println("Maintaining electric engine.");
    }
}
