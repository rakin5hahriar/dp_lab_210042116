package com.beverage;

import com.condiment.ICondiment;

public interface ICoffee {
    String getDescription();
    double getCost();
    ICoffee add(ICondiment condiment);
}
