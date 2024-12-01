package com.example.designpatterns.structural.proxy.InternetProxyProtectedProxy;

public class RealInternet implements Internet{

    @Override
    public void connectTo(String serverHost) throws Exception {
        System.out.println("connected to: "+serverHost);
    }
}
