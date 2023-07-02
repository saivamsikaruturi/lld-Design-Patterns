package com.example.designpatterns.behavioural.chainofresponsibility;

public class ValidateDispenser extends RDispenser {


    public ValidateDispenser(RDispenser rDispenser) {
        super(rDispenser);
    }

    @Override
    public void dispense(Currency cur) {
        if(cur.getAmount()%100==0){
            rDispenser.dispense(cur);
        } else {
            System.out.println("Please Enter Amount in 2000,500,100 denominations");
        }
    }
}
