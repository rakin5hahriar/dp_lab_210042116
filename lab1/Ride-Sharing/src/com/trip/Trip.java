package com.trip;

import com.Payment.PaymentMethod;
import com.rideType.RideType;
import com.riderdriver.Driver;
import com.riderdriver.Rider;

public class Trip {
    public RideType rideType;
    private Driver driver;
    private Rider rider;
    public double fare;
    private String status;

    public Trip(RideType rideType, Driver driver, Rider rider) {
        this.rideType = rideType;
        this.driver = driver;
        this.rider = rider;
        this.fare = rideType.calculateFare();
        this.status = "Pending";
    }

    public void startTrip() {
        this.fare = rideType.calculateFare();
        System.out.println("Trip started with " + rideType.getType());
        this.status = "Started";

    }

    public void completeTrip(PaymentMethod paymentMethod) {
        System.out.println("Trip completed.");
        this.status = "Completed";
        paymentMethod.processPayment(fare);

    }

}
