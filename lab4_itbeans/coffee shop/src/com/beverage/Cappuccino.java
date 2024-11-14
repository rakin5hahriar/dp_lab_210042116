package com.beverage;

import com.condiments.Condiment;

public class Cappuccino {
    Condiment condiment;
    public Cappuccino(Condiment condiment)
    {
        this.condiment = condiment;
    }
    public String getDescription() {
        return "Cappuccino";
    }


    public double cost() {
        return 3.50;
    }
}