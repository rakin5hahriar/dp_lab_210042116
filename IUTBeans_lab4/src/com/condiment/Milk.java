package com.condiment;

import com.beverage.ICoffee;

public class Milk extends CondimentDecorator {
    public Milk(ICondiment next) {
        super(next);
    }

    @Override
    public String getDescription() {
        return "Milk";
    }

    @Override
    public double getCost() {
        return 0.50;
    }
}