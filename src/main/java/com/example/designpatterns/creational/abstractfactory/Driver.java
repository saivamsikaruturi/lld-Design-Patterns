package com.example.designpatterns.creational.abstractfactory;


import com.example.designpatterns.creational.abstractfactory.bank.Bank;
import com.example.designpatterns.creational.abstractfactory.bank.BankType;
import com.example.designpatterns.creational.abstractfactory.loan.Loan;
import com.example.designpatterns.creational.abstractfactory.loan.LoanType;

public class Driver {
    public static void main(String[] args) {
        AbstractFactory<Bank, BankType> bankTypeAbstractFactory = AbstractFactoryProvider.getFactory(ObjectType.BANK);
        Bank bank = bankTypeAbstractFactory.create(BankType.HDFC);
        System.out.println(bank.getBankName());

        AbstractFactory<Loan, LoanType> loanTypeAbstractFactory = AbstractFactoryProvider.getFactory(ObjectType.LOAN);
        Loan loan = loanTypeAbstractFactory.create(LoanType.PERSONAL);
        System.out.println(loan.getInterestRate());

    }
}