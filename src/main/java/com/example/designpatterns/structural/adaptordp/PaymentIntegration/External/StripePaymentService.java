package com.example.designpatterns.structural.adaptordp.PaymentIntegration.External;

public class StripePaymentService {

    // Simulate Stripe payment initiation
    public void charge(double amount) {
        System.out.println("Processing payment of $" + amount + " through Stripe...");
        // Here you would typically call Stripe's API to process the payment
        // Example: Stripe API call, for instance using Stripe's Java SDK:
        // StripeAPIService.charge(amount);
        System.out.println("Payment successful via Stripe!");
    }
}

