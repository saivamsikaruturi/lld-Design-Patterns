package com.example.designpatterns.behavioural.startegy.PaymentSystem;


public class PayPal implements PaymentStrategy {

    private String email;

    private String password;

    @Override
    public void collectPaymentDetails() {
        email = "";
        password = "";
    }

    @Override
    public boolean validatePaymentDetails() {
        return true;
    }

    @Override
    public void pay(int amount) {
        System.out.println("amount " + amount + " is payed using paypal");
    }
}
