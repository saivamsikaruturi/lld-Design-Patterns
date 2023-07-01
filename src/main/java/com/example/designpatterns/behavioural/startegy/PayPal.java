package com.example.designpatterns.behavioural.startegy;


public class PayPal implements PaymentStrategy {

    private String email;

    private String password;
    @Override
    public void collectPaymentDetails() {

    }

    @Override
    public boolean validatePaymentDetails() {
        return false;
    }

    @Override
    public void pay(int amount) {

    }
}
