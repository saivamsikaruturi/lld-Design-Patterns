package com.example.designpatterns.structural.proxy.InternetProxyProtectedProxy;

public class Main {
    public static void main(String[] args) {
        Internet internet = new ProxyInternet(new RealInternet());

        try {
            internet.connectTo("google.com");
            internet.connectTo("xyz.com");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
