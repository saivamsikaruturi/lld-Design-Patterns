package com.example.designpatterns.structural.bridge.PaymentProcessingSystem;

public class CreditCardPayment extends Payment {
    public CreditCardPayment(PaymentGateway gateway) {
        super(gateway);
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Credit Card Payment...");
        gateway.makePayment(amount);
    }
}

