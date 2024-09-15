package com.riderdriver;

import com.Payment.PaymentMethod;
import com.notify.NotificationService;
import com.rideType.RideType;
import com.rideType.RideTypeFactory;

public class Rider {
    private String id;
    private String name;
    private double rating;
    private NotificationService notificationService;

    public Rider(String id, String name, double rating) {
        this.id = id;
        this.name = name;
        this.rating = rating;
    }

    public Rider(String riderName) {
        this.name = riderName;
    }

    public void requestRide(String rideType, double distance){
        RideType type = RideTypeFactory.getRideType(rideType, distance);
        System.out.println("Requesting ride...");
    }

    public void rateDriver(Driver driver, double rating) {
        driver.setRating(rating);
    }

    public void makePayment(PaymentMethod paymentMethod, double fare) {
        paymentMethod.processPayment(fare);
    }

    public void setNotificationService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public Object getName() {
        return name;
    }
}
