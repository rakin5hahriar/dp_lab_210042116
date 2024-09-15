package com.notify;

public class InApp implements NotificationService{
    private String userId;

    public InApp(String userId) {
        this.userId = userId;
    }

    @Override
    public void sendNotification(Object name, String message) {
        System.out.println("Sending in-app notification to " + userId + ": " + message);
    }
}
