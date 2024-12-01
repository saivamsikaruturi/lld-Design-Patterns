package com.example.designpatterns.structural.bridge.NotificationSystem;

public class EmailDelivery implements DeliveryStrategy {
    @Override
    public void send(String message) {
        System.out.println("Sending via Email: " + message);
    }
}