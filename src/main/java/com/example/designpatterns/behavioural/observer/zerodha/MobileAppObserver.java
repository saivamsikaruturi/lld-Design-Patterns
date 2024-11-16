package com.example.designpatterns.behavioural.observer.zerodha;

public class MobileAppObserver implements IObserver{
    @Override
    public void updatePrice(double price) {
        System.out.println("updated price in mobile "+price);
    }
}
