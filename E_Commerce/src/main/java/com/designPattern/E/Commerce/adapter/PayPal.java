package com.designPattern.E.Commerce.adapter;

public class PayPal {
    public void sendPayment(double amount) {
        System.out.println("Payment of $" + amount + " sent via PayPal.");
    }
}

