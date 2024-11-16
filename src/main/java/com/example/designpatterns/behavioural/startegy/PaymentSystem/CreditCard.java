package com.example.designpatterns.behavioural.startegy.PaymentSystem;

import lombok.Data;

@Data
public class CreditCard {
    private int amount = 1000;
    private final String number;
    private final String date;
    private final String cvv;

    public CreditCard(String number, String date, String cvv) {
        this.number = number;
        this.date = date;
        this.cvv = cvv;
    }
}
