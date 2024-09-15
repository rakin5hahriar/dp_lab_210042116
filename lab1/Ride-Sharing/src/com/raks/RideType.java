package com.raks;

public abstract class RideType {
    public String type;
    public double baseFare;
    public double distance;

    public RideType(double distance) {
        this.distance = distance;
    }

    public abstract double calculateFare();

    public String getType() {
        return type;
    }
}

use abstraction and interfaces at the same time

