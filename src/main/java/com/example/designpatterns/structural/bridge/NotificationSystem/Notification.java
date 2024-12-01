package com.example.designpatterns.structural.bridge.NotificationSystem;

public abstract class Notification {
    protected DeliveryStrategy deliveryStrategy;

    public Notification(DeliveryStrategy deliveryStrategy) {
        this.deliveryStrategy = deliveryStrategy;
    }

    public abstract void send(String message);
}
