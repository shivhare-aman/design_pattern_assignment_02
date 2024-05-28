package com.designPattern.E.Commerce.adapter;

public class Stripe {
    public void makePayment(double amount) {
        System.out.println("Payment of $" + amount + " made via Stripe.");
    }
}