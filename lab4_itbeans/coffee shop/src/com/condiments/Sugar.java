package com.condiments;

import com.beverage.Beverage;

public class Sugar implements Condiment {
    private final Beverage beverage;

    public Sugar(Beverage beverage) {
        this.beverage = beverage;
    }

    public Sugar() {
        this.beverage = beverage;
    }


    public String getDescription() {
        return beverage.getDescription() + ", " + getCondimentDescription();
    }

    @Override
    public double cost() {
        return beverage.cost() + getCondimentCost();
    }

    @Override
    public String getCondimentDescription() {
        return "Sugar";
    }

    @Override
    public double getCondimentCost() {
        return 0.20;
    }
}
