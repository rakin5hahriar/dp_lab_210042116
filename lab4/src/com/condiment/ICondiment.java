package com.condiment;

import com.beverage.ICoffee;

public interface ICondiment {
    String getDescription();

    double getCost();

    ICondiment getNext();

    void setNext(ICondiment condiment);

}