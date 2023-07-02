package com.example.designpatterns.behavioural.chainofresponsibility;

public class R500Dispenser extends RDispenser {
    public R500Dispenser(RDispenser rDispenser) {
        super(rDispenser);
    }

    @Override
    public void dispense(Currency cur) {
        if(cur.getAmount()>=500){
            int num = cur.getAmount()/500;
            int remainder = cur.getAmount() % 500;
            System.out.println("Dispensing "+num+" 500$ note");
            if(remainder !=0) rDispenser.dispense(new Currency(remainder));
        }
    }
}
