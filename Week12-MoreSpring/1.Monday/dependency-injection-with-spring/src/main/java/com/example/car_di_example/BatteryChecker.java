package com.example.car_di_example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BatteryChecker {
    private final BatteryHealthMonitor monitor;

    @Autowired
    public BatteryChecker(BatteryHealthMonitor monitor) {
        this.monitor = monitor;
    }

    public void checkBattery() {
        monitor.monitorBatteryHealth();
        System.out.println("Checking battery.");
    }
}
