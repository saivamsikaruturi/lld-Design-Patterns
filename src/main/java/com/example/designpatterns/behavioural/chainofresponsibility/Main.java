package com.example.designpatterns.behavioural.chainofresponsibility;

public class Main {
    public static void main(String[] args) {
      RDispenser dollarDispenser = new ValidateDispenser(
                new R2000Dispenser(new R500Dispenser(new R100Dispenser(null)))
        );

        dollarDispenser.dispense(new Currency(15100));

        dollarDispenser.dispense(new Currency(5620));
    }
}
