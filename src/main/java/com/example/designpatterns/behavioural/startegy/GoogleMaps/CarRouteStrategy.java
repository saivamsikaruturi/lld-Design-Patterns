package com.example.designpatterns.behavioural.startegy.GoogleMaps;

public class CarRouteStrategy implements ImapStrategy{
    @Override
    public void calculateRoute(String source, String destination) {
        System.out.println("car strategy");
    }
}
