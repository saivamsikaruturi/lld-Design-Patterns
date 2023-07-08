package com.example.designpatterns.behavioural.startegy;

public class Test {
    public static void main(String[] args) {
        PaymentService paymentService=new PaymentService();
        paymentService.setPaymentStrategy(new PayPal());
        paymentService.processOrder();
    }

}
