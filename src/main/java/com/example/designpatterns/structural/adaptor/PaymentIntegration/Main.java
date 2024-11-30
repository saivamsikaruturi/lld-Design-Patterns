package com.example.designpatterns.structural.adaptor.PaymentIntegration;

import com.example.designpatterns.structural.adaptor.PaymentIntegration.External.PayPalPaymentService;
import com.example.designpatterns.structural.adaptor.PaymentIntegration.External.StripePaymentService;

public class Main {
    public static void main(String[] args) {
        // Assuming you have PayPal and Stripe services instantiated already
        PayPalPaymentService payPalService = new PayPalPaymentService();
        StripePaymentService stripeService = new StripePaymentService();

        // Create the PayPal Adapter
        PaymentProcessor payPalProcessor = new PayPalAdapter(payPalService);

        // Or create the Stripe Adapter
        PaymentProcessor stripeProcessor = new StripeAdapter(stripeService);

        PaymentService paymentService = new PaymentService(payPalProcessor);
        paymentService.process(100.0); // Process payment through PayPal

        // Switch to Stripe if needed
        paymentService = new PaymentService(stripeProcessor);
        paymentService.process(200.0); // Process payment through Stripe
    }
}
