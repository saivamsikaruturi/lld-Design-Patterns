package com.example.designpatterns.behavioural.startegy.GoogleMaps;



public class TransportModeFactory {

      public static ImapStrategy getFactoryMode(TransportationMode mode){

          return switch (mode){
              case CAR -> new CarRouteStrategy();
              case BIKE -> new BikeRouteStrategy();
              default -> throw new IllegalArgumentException();
          };
      }

}
