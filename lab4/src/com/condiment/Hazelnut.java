package com.condiment;

import com.beverage.ICoffee;

public class Hazelnut extends CondimentDecorator {
    public Hazelnut(ICondiment next) {
        super(next);
    }

    @Override
    public String getDescription() {
        return "Hazelnut";
    }

    @Override
    public double getCost() {
        return 0.50;
    }
}