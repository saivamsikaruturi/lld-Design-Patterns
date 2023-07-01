package com.example.designpatterns.behavioural.startegy;

public interface PaymentStrategy {

    void collectPaymentDetails();
    boolean validatePaymentDetails();
    void pay(int amount);
}
