package com.example.designpatterns.structural.bridge.NotificationSystem;

public class WhatsAppDelivery implements DeliveryStrategy {
    @Override
    public void send(String message) {
        System.out.println("Sending via WhatsApp: " + message);
    }
}