package com.example.designpatterns.structural.adaptordp.PaymentIntegration;

public class PaymentService {
    private PaymentProcessor paymentProcessor;

    // You can inject PayPal or Stripe adapter based on your requirements
    public PaymentService(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public void process(double amount) {
        paymentProcessor.processPayment(amount);
    }
}
