package com.example.designpatterns.structural.composite;

public class CurrentAccount  implements  Account{
    public CurrentAccount(String bankName, int balance) {
        this.bankName = bankName;
        this.balance = balance;
    }

    private String bankName;
    private int balance;
    @Override
    public void showAccountDetails() {
        System.out.println(bankName+ " - "+balance);
    }
}
