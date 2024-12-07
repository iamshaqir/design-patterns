package com.mshaq.dp.hfdp;

import com.mshaq.dp.hfdp.behaviours.FlyWithWings;
import com.mshaq.dp.hfdp.behaviours.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        super.flyBehaviour = new FlyWithWings();
        super.quackBehaviour = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
