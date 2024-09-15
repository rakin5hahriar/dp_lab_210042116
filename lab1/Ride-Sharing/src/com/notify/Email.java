package com.notify;

public class Email implements NotificationService{
    private String emailId;

    public Email(String emailId) {
        this.emailId = emailId;
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("Sending email to " + emailId + ": " + message);
    }
}
