package com.example.designpatterns.structural.bridge.NotificationSystem;

public class TextNotification extends Notification {
    public TextNotification(DeliveryStrategy deliveryStrategy) {
        super(deliveryStrategy);
    }

    @Override
    public void send(String message) {
        System.out.println("Processing Text Notification...");
        deliveryStrategy.send(message);
    }
}

