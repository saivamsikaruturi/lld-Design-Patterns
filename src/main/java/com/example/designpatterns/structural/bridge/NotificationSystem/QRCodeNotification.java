package com.example.designpatterns.structural.bridge.NotificationSystem;

public class QRCodeNotification extends Notification {
    public QRCodeNotification(DeliveryStrategy deliveryStrategy) {
        super(deliveryStrategy);
    }

    @Override
    public void send(String message) {
        System.out.println("Processing QR Code Notification...");
        deliveryStrategy.send(message);
    }
}