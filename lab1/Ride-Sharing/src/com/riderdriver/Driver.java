package com.riderdriver;

import com.trip.Trip;

public class Driver {
    private String id;
    private String name;
    private double rating;

    public Driver(String id, String name, double rating) {
        this.id = id;
        this.name = name;
        this.rating = rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void acceptRide(Trip trip) {
        System.out.println("Driver accepted the trip.");
    }
}
