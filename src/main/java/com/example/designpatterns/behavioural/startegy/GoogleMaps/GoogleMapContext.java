package com.example.designpatterns.behavioural.startegy.GoogleMaps;

public class GoogleMapContext {
    ImapStrategy imapStrategy;

    public GoogleMapContext(ImapStrategy imapStrategy) {
        this.imapStrategy = imapStrategy;
    }

      void getRoute(String source,String destination){
        imapStrategy.calculateRoute(source,destination);
      }

}
