package com.example.designpatterns.structural.decorator.CarManufacturing;

public class CarDecorator implements Car {

     protected Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }

    @Override
    public void assemble() {
    car.assemble();
    }

}
