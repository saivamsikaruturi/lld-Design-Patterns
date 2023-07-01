package com.example.designpatterns.structural.proxy;

public class NetworkSettings {
    public ISP getInternet(){
        return new InternetProxy();
    }

    public ISP getISP(){
        return new Jio();
    }
}