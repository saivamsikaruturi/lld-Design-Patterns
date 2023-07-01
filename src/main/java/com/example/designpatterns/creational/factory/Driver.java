package com.example.designpatterns.creational.factory;

public class Driver {

    public static void main(String[] args) {

        NotificationAttributes attributes = new NotificationAttributes(
                "9441873023","7780570356","Your Mobile OTP : 35654 valid for 10 minus"
        );

        Notification notification = NotificationFactory.getInstance(NotificationType.SMS);

        notification.sendNotification(attributes);
        NotificationAttributes emailAttributes = new NotificationAttributes(
                "krishnavamsikaruturi8@gmail.com","saikaruturi8@gmail.com","Your Mobile OTP : 35654 valid for 10 minus"
        );
        notification = NotificationFactory.getInstance(NotificationType.EMAIL);

        notification.sendNotification(emailAttributes);


    }
}