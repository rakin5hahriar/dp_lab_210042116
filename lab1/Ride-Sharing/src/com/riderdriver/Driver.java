package com.riderdriver;

import com.notify.NotificationService;
import com.trip.Trip;

public class Driver {
    private String id;
    private String name;
    private double rating;
    private NotificationService notificationService;

    public Driver(String id, String name, double rating) {
        this.id = id;
        this.name = name;
        this.rating = rating;
    }

    public Driver(String driverName) {
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void acceptRide() {
        System.out.println("Driver accepted the trip.");
    }

    public void startRide(Trip trip) {
        System.out.println("Ride started.");
    }

    public void completeRide(Trip trip) {
        System.out.println("Ride completed.");
    }

    public void setNotificationService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public double getRating() {
        return rating;
    }
}
