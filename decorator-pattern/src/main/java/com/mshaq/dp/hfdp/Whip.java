package com.mshaq.dp.hfdp;

public class Whip extends CondimentDecorator {

    private final Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.36;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }
}
