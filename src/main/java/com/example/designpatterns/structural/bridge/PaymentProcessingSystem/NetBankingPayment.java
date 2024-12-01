package com.example.designpatterns.structural.bridge.PaymentProcessingSystem;

public class NetBankingPayment extends Payment {
    public NetBankingPayment(PaymentGateway gateway) {
        super(gateway);
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Net Banking Payment...");
        gateway.makePayment(amount);
    }
}