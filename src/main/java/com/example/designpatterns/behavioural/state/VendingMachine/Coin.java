package com.example.designpatterns.behavioural.state.VendingMachine;

public enum Coin {

    PENNY(1),
    NICKEL(5),
    DIME(10),
    QUARTER(25);

    public int value;

    Coin(int value) {
        this.value = value;
    }

}
