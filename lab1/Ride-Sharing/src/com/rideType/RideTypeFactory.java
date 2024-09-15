package com.rideType;

public class RideTypeFactory {
    public static RideType getRideType(String rideType, double distance) {
        switch (rideType) {
            case "Carpool":
                return new CarpoolRide(distance);
            case "Luxury":
                return new LuxuryRide(distance);
            case "BikeRide":
                return new BikeRide(distance);
            default:
                throw new IllegalArgumentException("Invalid Ride Type");
        }
    }
}
