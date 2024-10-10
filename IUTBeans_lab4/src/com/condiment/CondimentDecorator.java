package com.condiment;

import com.beverage.ICoffee;

public abstract class CondimentDecorator implements ICondiment {
    private ICondiment next;

    public CondimentDecorator(ICondiment next) {
        this.next = next;
    }
    @Override
    public ICondiment getNext() {
        return next;
    }
    @Override
    public void setNext(ICondiment condiment) {
        this.next = condiment;
    }
}
