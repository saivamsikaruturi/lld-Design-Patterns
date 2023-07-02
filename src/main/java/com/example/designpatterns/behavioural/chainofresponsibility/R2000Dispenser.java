package com.example.designpatterns.behavioural.chainofresponsibility;

public class R2000Dispenser extends RDispenser{
    public R2000Dispenser(RDispenser rDispenser) {
        super(rDispenser);
    }

    @Override
    public void dispense(Currency cur) {
        if(cur.getAmount()>=2000){
            int num = cur.getAmount()/2000;
            int remainder = cur.getAmount() % 2000;
            System.out.println("Dispensing "+num+" 2000$ note");
            if(remainder !=0) rDispenser.dispense(new Currency(remainder));
        }
    }
}
