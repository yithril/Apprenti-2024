package com.example.car_di_example;

import org.springframework.stereotype.Component;

@Component
public class BatteryHealthMonitor {
    public void monitorBatteryHealth() {
        System.out.println("Monitoring battery health.");
    }
}
