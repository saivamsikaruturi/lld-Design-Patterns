package com.example.designpatterns.behavioural.startegy.GoogleMaps;

public class Driver {
    public static void main(String[] args) {

        ImapStrategy imapStrategy = TransportModeFactory.getFactoryMode(TransportationMode.CAR);
        GoogleMapContext googleMapContext = new GoogleMapContext(imapStrategy);
        googleMapContext.getRoute("hyd","bnglr");
    }
}
