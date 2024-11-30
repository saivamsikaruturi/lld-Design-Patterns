package com.example.designpatterns.structural.adaptor.PaymentIntegration;

import com.example.designpatterns.structural.adaptor.PaymentIntegration.External.StripePaymentService;

public class StripeAdapter implements PaymentProcessor {
    private StripePaymentService stripePaymentService; // Assume this is a third-party Stripe API service

    public StripeAdapter(StripePaymentService stripePaymentService) {
        this.stripePaymentService = stripePaymentService;
    }

    @Override
    public void processPayment(double amount) {
        // Convert payment logic to Stripe's method
        stripePaymentService.charge(amount);
    }
}
