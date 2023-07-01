package com.example.designpatterns.behavioural.startegy;

import lombok.Setter;

@Setter
public class PaymentService {

    private PaymentStrategy paymentStrategy;

    public void processOrder(){
        paymentStrategy.collectPaymentDetails();
        if(paymentStrategy.validatePaymentDetails()){
            paymentStrategy.pay(getTotal());
        }
    }

    private int getTotal() {
        return 100;
    }

  }
