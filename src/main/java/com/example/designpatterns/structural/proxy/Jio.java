package com.example.designpatterns.structural.proxy;

public class Jio implements ISP {
    @Override
    public String getResource(String site) {
        switch (site) {
            case "www.google.com":
                return "GOOOOOOOOOOOOOOOGLE";
            case "www.yahoo.com":
                return "Yahooooooooooooo";
            default:
                return "Sorry no resource found";
        }

    }
}
