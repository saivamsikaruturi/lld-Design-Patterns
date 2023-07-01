package com.example.designpatterns.creational.abstractfactory.bank;

public class HDFC implements Bank{

    String name;

    public HDFC(){
        this.name = "HDFC";
    }

    @Override
    public String getBankName() {
        return name;
    }
}