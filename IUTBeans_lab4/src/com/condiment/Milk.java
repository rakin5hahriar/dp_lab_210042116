package com.condiment;

import com.beverage.IBeverage;

public class Milk extends BaseCondiment {
    public Milk(IBeverage beverage) {
        super(beverage);
    }

    @Override
    protected String getCondimentName() {
        return "Milk";
    }

    @Override
    protected double getCondimentCost() {
        return 0.50;
    }
}
