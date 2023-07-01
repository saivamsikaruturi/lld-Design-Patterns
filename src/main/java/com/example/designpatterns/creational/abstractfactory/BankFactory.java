package com.example.designpatterns.creational.abstractfactory;


import com.example.designpatterns.creational.abstractfactory.bank.*;
import com.example.designpatterns.creational.abstractfactory.exception.ObjectCreationException;

public class BankFactory implements AbstractFactory<Bank, BankType> {

    @Override
    public Bank create(BankType type) {
        switch (type){
            case SBI: return new SBI();
            case HDFC: return new HDFC();
            case ICICI: return new ICICI();
            default: throw new ObjectCreationException("invalid bank");
        }
    }
}