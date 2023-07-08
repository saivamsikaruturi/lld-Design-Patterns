package com.example.designpatterns.behavioural.command.cartexample;

public class FoodDeliveryException extends RuntimeException {
    private String message;

    public FoodDeliveryException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}