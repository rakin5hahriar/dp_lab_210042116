package com.rideType;

public class BikeRide implements RideType {
    private double distance;
    private final String type = "Bike";
    private final double baseFare = 2.0;

    public BikeRide(double distance) {
        this.distance = distance;
    }

    @Override
    public double calculateFare() {
        return baseFare + distance * 0.2;
    }

    @Override
    public String getType() {
        return type;
    }
}