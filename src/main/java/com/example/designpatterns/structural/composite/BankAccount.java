package com.example.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class BankAccount implements Account{

    private List<Account> accountList=new ArrayList<>();
    @Override
    public void showAccountDetails() {
        for(Account account:accountList){
            account.showAccountDetails();
        }
    }
    public void addAccount(Account account){
        accountList.add(account);
    }
    public void remove(Account account){
        accountList.remove(account);
    }
}
