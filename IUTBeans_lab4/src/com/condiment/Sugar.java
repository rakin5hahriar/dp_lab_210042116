package com.condiment;

import com.beverage.ICoffee;

public class Sugar extends CondimentDecorator {
    public Sugar(ICondiment next) {
        super(next);
    }

    @Override
    public String getDescription() {
        return "Sugar";
    }

    @Override
    public double getCost() {
        return 0.25;
    }
}