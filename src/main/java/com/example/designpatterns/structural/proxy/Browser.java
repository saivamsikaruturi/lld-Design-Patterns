package com.example.designpatterns.structural.proxy;

import javax.swing.*;

public class Browser {

    public void sendRequest(){
        String site = JOptionPane.showInputDialog("Enter the site URL");
        String response = this.getInternetProvider().getResource(site);
        this.loadResponse(response);
    }
    /**
     * Prints the output from ISP
     * @param response
     */
    private void loadResponse(String response){
        System.out.println(response);
    }

    /**
     * Gets the network settings for ISP to use.
     * @return ISP
     */
    private ISP getInternetProvider(){
        return new NetworkSettings().getInternet();
    }
}
