package com.example.designpatterns.structural.proxy.InternetProxyProtectedProxy;

public class ProxyInternet implements Internet{

    Internet internet;
    public ProxyInternet(Internet internet) {
        this.internet = internet;
    }

    @Override
    public void connectTo(String serverHost) throws Exception {
            if(Properties.bannedSites.contains(serverHost)){
               throw new Exception("Access denied to:"+ serverHost);
            }
            internet.connectTo(serverHost);

    }
}
