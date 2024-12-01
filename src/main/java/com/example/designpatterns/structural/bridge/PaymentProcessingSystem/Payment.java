package com.example.designpatterns.structural.bridge.PaymentProcessingSystem;

public abstract class Payment {
    protected PaymentGateway gateway;

    public Payment(PaymentGateway gateway) {
        this.gateway = gateway;
    }

    public abstract void processPayment(double amount);
}
