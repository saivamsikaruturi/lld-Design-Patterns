package com.example.designpatterns.behavioural.startegy.PaymentSystem;

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


        public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
            this.paymentStrategy = paymentStrategy;
        }



    private int getTotal() {
        return 100;
    }


}
