package com.raks;

public class BikeRide extends RideType {
    public BikeRide(double distance) {
        super(distance);
        this.type = "Bike";
        this.baseFare = 2.0;
    }

    @Override
    public double calculateFare() {
        return baseFare + distance * 0.2;
    }
}
