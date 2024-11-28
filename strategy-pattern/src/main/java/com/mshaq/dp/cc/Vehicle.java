package com.mshaq.dp.cc;

import com.mshaq.dp.cc.strategy.DriveStrategy;

public class Vehicle {

    private final DriveStrategy driveStrategy;

    public Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void drive(String message) {
        driveStrategy.drive(message);
    }
}
