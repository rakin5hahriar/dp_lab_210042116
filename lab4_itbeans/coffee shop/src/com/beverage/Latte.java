package com.beverage;

public class Latte implements Beverage {
    @Override
    public String getDescription() {
        return "Latte";
    }

    @Override
    public double cost() {
        return 3.00;
    }
}