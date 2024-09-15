package com.riderdriver;

import com.Payment.PaymentMethod;
import com.rideType.RideType;
import com.rideType.RideTypeFactory;

public class Rider {
    private String id;
    private String name;
    private double rating;

    public Rider(String id, String name, double rating) {
        this.id = id;
        this.name = name;
        this.rating = rating;
    }

    public void requestRide(String rideType, double distance, Driver driver){
        RideType type = RideTypeFactory.getRideType(rideType, distance);
        System.out.println("Requesting ride...");
    }

    public void rateDriver(Driver driver, double rating) {
        driver.setRating(rating);
    }

    public void makePayment(PaymentMethod paymentMethod, double fare) {
        paymentMethod.processPayment(fare);
    }
}
