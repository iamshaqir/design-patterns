package com.mshaq.dp.cc.strategy;

public class NormalDriveStrategy implements DriveStrategy {
    @Override
    public void drive(String message) {
        System.out.println("Normal drive strategy ::: " + message);
    }
}
