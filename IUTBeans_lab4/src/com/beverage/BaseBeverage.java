package com.beverage;

public abstract class BaseBeverage implements IBeverage {
    protected abstract String getBaseName();
    protected abstract double getBaseCost();

    @Override
    public String getDescription() {
        return getBaseName();
    }

    @Override
    public double getCost() {
        return getBaseCost();
    }
}
