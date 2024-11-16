package com.example.designpatterns.behavioural.observer.zerodha;

public class WebAppObserver implements IObserver{
    @Override
    public void updatePrice(double price) {
        System.out.println("update stock price in web: "+price);
    }
}
