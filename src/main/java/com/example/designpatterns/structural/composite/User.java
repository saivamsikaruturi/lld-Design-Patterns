package com.example.designpatterns.structural.composite;

public class User {
    public static void main(String[] args) {
        SavingAccount savingAccount=new SavingAccount("ICICI",89345.88);
        SavingAccount savingAccount1=new SavingAccount("SBI",89345.88);
        SavingAccount savingAccount2=new SavingAccount("ANDHRA",89345.88);
       BankAccount savings=new BankAccount();
        savings.addAccount(savingAccount);
        savings.addAccount(savingAccount1);
        savings.addAccount(savingAccount2);

       CurrentAccount currentAccount = new CurrentAccount("HSBC",4537);
       CurrentAccount currentAccount1 = new CurrentAccount("INDIAN",42434);

       BankAccount current = new BankAccount();
       current.addAccount(currentAccount);
       current.addAccount(currentAccount1);

       BankAccount allAccounts = new BankAccount();
       allAccounts.addAccount(current);
       allAccounts.addAccount(savings);
       allAccounts.showAccountDetails();

    }
}
