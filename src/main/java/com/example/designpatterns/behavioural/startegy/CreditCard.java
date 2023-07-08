package com.example.designpatterns.behavioural.startegy;

import lombok.Data;

@Data
public class CreditCard {
    private int amount = 1000;
    private final String number;
    private final String date;
    private final String cvv;
}
