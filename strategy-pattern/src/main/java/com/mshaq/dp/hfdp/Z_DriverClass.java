package com.mshaq.dp.hfdp;

import com.mshaq.dp.hfdp.behaviours.FlyRockerPowered;

public class Z_DriverClass {

    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        Duck modelDuck = new ModelDuck();

        // default behaviour initialized within constructor
        modelDuck.performFly();

        // setting new behaviour at run-time
        modelDuck.setFlyBehaviour(new FlyRockerPowered());
        modelDuck.performFly();
    }
}
