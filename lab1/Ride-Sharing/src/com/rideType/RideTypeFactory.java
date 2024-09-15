package com.rideType;

public class RideTypeFactory {
    public RideType getRideType(String type, double distance) {
        if (type == null) {
            return null;
        }
        if (type.equalsIgnoreCase("LUXURY")) {
            return new LuxuryRide(distance);
        } else if (type.equalsIgnoreCase("BIKE")) {
            return new BikeRide(distance);
        } else if (type.equalsIgnoreCase("CARPOOL")) {
            return new CarpoolRide(distance);
        }
        return null;
    }
}