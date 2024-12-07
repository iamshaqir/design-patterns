package com.mshaq.dp.hfdp;

import com.mshaq.dp.hfdp.behaviours.FlyNoWay;
import com.mshaq.dp.hfdp.behaviours.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        super.flyBehaviour = new FlyNoWay();
        super.quackBehaviour = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
