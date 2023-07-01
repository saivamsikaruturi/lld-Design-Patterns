package com.example.designpatterns.behavioural.startegy;



public class PaymentCreditCard implements PaymentStrategy {
   CreditCard creditCard;
    @Override
    public void collectPaymentDetails() {
        creditCard=new CreditCard();

    }

    @Override
    public boolean validatePaymentDetails() {
        return true;
    }

    @Override
    public void pay(int amount) {
        System.out.println("paid using credit card");

    }
}
