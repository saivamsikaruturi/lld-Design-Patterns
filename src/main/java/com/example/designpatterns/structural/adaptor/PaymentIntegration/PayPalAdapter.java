package com.example.designpatterns.structural.adaptor.PaymentIntegration;

import com.example.designpatterns.structural.adaptor.PaymentIntegration.External.PayPalPaymentService;

public class PayPalAdapter implements PaymentProcessor {
    private PayPalPaymentService payPalPaymentService; // Assume this is a third-party PayPal API service

    public PayPalAdapter(PayPalPaymentService payPalPaymentService) {
        this.payPalPaymentService = payPalPaymentService;
    }

    @Override
    public void processPayment(double amount) {
        // Convert payment logic to PayPal's method
        payPalPaymentService.initiatePayment(amount);
    }
}
