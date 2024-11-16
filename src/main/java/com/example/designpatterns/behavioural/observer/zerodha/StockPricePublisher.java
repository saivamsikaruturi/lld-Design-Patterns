package com.example.designpatterns.behavioural.observer.zerodha;

import java.util.ArrayList;
import java.util.List;

public class StockPricePublisher {


    private double price;

    private List<IObserver> observerList = new ArrayList<>();

    public void subscribe(IObserver observer){
        observerList.add(observer);
    }

    public void unSubscribe(IObserver observer){
        observerList.remove(observer);

    }
    public void setPrice(double newPrice) {
        this.price = newPrice;
        updateObserver(newPrice);
    }

    public void updateObserver(double newPrice){
        for(IObserver observer : observerList){
            observer.updatePrice(newPrice);
        }
    }

}
