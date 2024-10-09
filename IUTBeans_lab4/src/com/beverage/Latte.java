package com.beverage;

import com.beverage.BaseBeverage;

public class Latte extends BaseBeverage {
    @Override
    protected String getBaseName() {
        return "com.beverage.Latte";
    }

    @Override
    protected double getBaseCost() {
        return 2.49;
    }
}
