package com.condiment;

import com.beverage.IBeverage;

public class Hazelnut extends BaseCondiment {
    public Hazelnut(IBeverage beverage) {
        super(beverage);
    }

    @Override
    protected String getCondimentName() {
        return "Hazelnut";
    }

    @Override
    protected double getCondimentCost() {
        return 0.60;
    }
}
