package com.rideType;


public class CarpoolRide implements RideType {
    private double distance;
    private final String type = "Carpool";
    private final double baseFare = 5.0;

    public CarpoolRide(double distance) {
        this.distance = distance;
    }

    @Override
    public double calculateFare() {
        return baseFare + distance * 0.5;
    }

    @Override
    public String getType() {
        return type;
    }
}