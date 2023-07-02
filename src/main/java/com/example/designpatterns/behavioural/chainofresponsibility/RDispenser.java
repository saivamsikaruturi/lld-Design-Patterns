package com.example.designpatterns.behavioural.chainofresponsibility;

public abstract class RDispenser {
    public RDispenser rDispenser;

    public RDispenser(RDispenser rDispenser) {
        this.rDispenser = rDispenser;
    }
    public abstract void dispense(Currency currency);
}
