package com.example.designpatterns.behavioural.chainofresponsibility;

public class R100Dispenser extends RDispenser{
    public R100Dispenser(RDispenser rDispenser) {
        super(rDispenser);
    }

    @Override
    public void dispense(Currency cur) {
        if(cur.getAmount()>=100){
            int num = cur.getAmount()/100;
            int remainder = cur.getAmount() % 100;
            System.out.println("Dispensing "+num+" 100$ note");
            if(remainder !=0) rDispenser.dispense(new Currency(remainder));
        }
    }
}
