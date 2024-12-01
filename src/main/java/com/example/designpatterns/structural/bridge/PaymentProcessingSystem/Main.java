package com.example.designpatterns.structural.bridge.PaymentProcessingSystem;

public class Main {
    public static void main(String[] args) {
        // Choose a payment gateway
        PaymentGateway payPalGateway = new PayPalGateway();
        PaymentGateway stripeGateway = new StripeGateway();

        // Choose a payment method with a gateway
        Payment creditCardPayment = new CreditCardPayment(payPalGateway);
        Payment netBankingPayment = new NetBankingPayment(stripeGateway);

        // Process payments
        creditCardPayment.processPayment(150.00);
        netBankingPayment.processPayment(250.00);
    }
}
