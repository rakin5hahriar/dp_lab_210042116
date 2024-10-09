package com.condiment;

import com.beverage.IBeverage;

public abstract class BaseCondiment implements ICondiment {
    protected IBeverage beverage;

    public BaseCondiment(IBeverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", " + getCondimentName();
    }

    @Override
    public double getCost() {
        return beverage.getCost() + getCondimentCost();
    }

    protected abstract String getCondimentName();
    protected abstract double getCondimentCost();
}
