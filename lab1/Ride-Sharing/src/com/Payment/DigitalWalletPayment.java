package com.Payment;

public class DigitalWalletPayment {
    private String walletId;

    public DigitalWalletPayment(String walletId) {
        this.walletId = walletId;
    }

    public void processPayment(double amount) {
        System.out.println("Processing payment of " + amount + " using digital wallet " + walletId + "...");
    }
}
