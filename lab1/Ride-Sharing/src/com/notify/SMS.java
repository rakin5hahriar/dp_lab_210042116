package com.notify;

public class SMS implements NotificationService{
    private String phoneNumber;

    public SMS(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void sendNotification(Object name, String message) {
        System.out.println("Sending SMS to " + phoneNumber + ": " + message);
    }
}
