package com.raks;

public class LuxuryRide extends RideType {
    public LuxuryRide(double distance) {
        super(distance);
        this.type = "Luxury";
        this.baseFare = 20.0;
    }

    @Override
    public double calculateFare() {
        return baseFare + distance * 1.5;
    }
}