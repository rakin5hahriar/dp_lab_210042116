package com.raks;

public class Carpool extends RideType {
    public Carpool(double distance) {
        super(distance);
        this.type = "Carpool";
        this.baseFare = 5.0;
    }

    @Override
    public double calculateFare() {
        return baseFare + distance * 0.5;
    }
}
