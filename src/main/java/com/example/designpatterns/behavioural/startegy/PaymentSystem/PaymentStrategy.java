package com.example.designpatterns.behavioural.startegy.PaymentSystem;

public interface PaymentStrategy {

    void collectPaymentDetails();
    boolean validatePaymentDetails();
    void pay(int amount);
}
