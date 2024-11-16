package com.example.designpatterns.structural.decorator.CarManufacturing;

public class BasicCar implements Car {

    @Override
    public void assemble() {
        System.out.print(" Basic Car -");
    }
}
