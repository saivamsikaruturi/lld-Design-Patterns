package com.example.designpatterns.structural.bridge.PaymentProcessingSystem;

public class PayPalGateway implements PaymentGateway {
    @Override
    public void makePayment(double amount) {
        System.out.println("Payment of $" + amount + " made via PayPal.");
    }
}