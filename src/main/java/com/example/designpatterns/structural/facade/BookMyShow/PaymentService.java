package com.example.designpatterns.structural.facade.BookMyShow;

class PaymentService {
    public boolean processPayment(String paymentMethod, double amount) {
        // Simulate payment processing
        if (amount > 0) {
            System.out.println("Payment of $" + amount + " completed using " + paymentMethod + ".");
            return true;
        } else {
            System.out.println("Invalid payment amount: $" + amount + ".");
            return false;
        }
    }
}
