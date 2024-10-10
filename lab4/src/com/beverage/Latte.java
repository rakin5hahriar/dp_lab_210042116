package com.beverage;

public class Latte extends BaseCoffee {
    @Override
    protected String getBaseName() {
        return "Latte";
    }

    @Override
    protected double getBaseCost() {
        return 100;
    }
}
