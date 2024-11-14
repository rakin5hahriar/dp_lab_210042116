package com.condiments;

import com.beverage.Beverage;

public class Milk implements Condiment {
    private final Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }


    public String getDescription() {
        return beverage.getDescription() + ", " + getCondimentDescription();
    }


    public double cost() {
        return beverage.cost() + getCondimentCost();
    }

    @Override
    public String getCondimentDescription() {
        return "Milk";
    }

    @Override
    public double getCondimentCost() {
        return 0.50;
    }
}