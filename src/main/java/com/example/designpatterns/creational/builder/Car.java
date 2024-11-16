package com.example.designpatterns.creational.builder;

public class Car {

    String name;
    int number;
    String color;


    public Car(CarBuilder builder) {
        this.name = builder.name;
        this.number = builder.number;
        this.color = builder.color;
    }

    static class CarBuilder{
        String name;
        int number;
        String color;

        public CarBuilder(int number, String name) {
            this.number = number;
            this.name = name;
        }

        public CarBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public Car build(){
            return new Car(this);
        }
    }
}
