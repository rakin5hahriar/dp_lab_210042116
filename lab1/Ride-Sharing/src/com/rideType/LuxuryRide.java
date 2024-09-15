package com.rideType;

public class LuxuryRide implements RideType {
    private double distance;
    private final String type = "Luxury";
    private final double baseFare = 20.0;

    public LuxuryRide(double distance) {
        this.distance = distance;
    }

    @Override
    public double calculateFare() {
        return baseFare + distance * 1.5;
    }

    @Override
    public String getType() {
        return type;
    }
}