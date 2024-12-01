package com.example.designpatterns.structural.bridge.NotificationSystem;

public class Main {
    public static void main(String[] args) {
        // Create a delivery strategy
        DeliveryStrategy emailDelivery = new EmailDelivery();
        DeliveryStrategy whatsappDelivery = new WhatsAppDelivery();

        // Create notifications with different delivery strategies
        Notification textNotification = new TextNotification(emailDelivery);
        Notification qrCodeNotification = new QRCodeNotification(whatsappDelivery);

        // Send notifications
        textNotification.send("Hello via Email!");
        qrCodeNotification.send("Scan this QR Code via WhatsApp!");
    }
}
