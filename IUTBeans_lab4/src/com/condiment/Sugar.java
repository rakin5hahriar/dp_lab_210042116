package com.condiment;

import com.beverage.IBeverage;

public class Sugar extends BaseCondiment {
    public Sugar(IBeverage beverage) {
        super(beverage);
    }

    @Override
    protected String getCondimentName() {
        return "Sugar";
    }

    @Override
    protected double getCondimentCost() {
        return 0.25;
    }
}
