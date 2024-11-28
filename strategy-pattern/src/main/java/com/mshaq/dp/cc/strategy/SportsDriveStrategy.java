package com.mshaq.dp.cc.strategy;

public class SportsDriveStrategy implements DriveStrategy {
    @Override
    public void drive(String message) {
        System.out.println("Sports drive strategy :::: " + message);
    }
}
