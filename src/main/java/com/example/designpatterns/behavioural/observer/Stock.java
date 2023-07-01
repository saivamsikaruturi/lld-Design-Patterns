package com.example.designpatterns.behavioural.observer;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class Stock implements Observable {

    private List<Observer> observers;
    private String name;

    public Stock(){
        observers = new ArrayList<Observer>();
    }


    private int price;

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }



    @Override
    public void registerObserver(Observer observer) {
        if (observer != null) {
            this.observers.add(observer);
        }
    }

    @Override
    public void notifyObservers() {
        Iterator<Observer> iterator = observers.iterator();
        while (iterator.hasNext()) {
            Observer observer = iterator.next();
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        if (observer != null) {
            this.observers.remove(observer);
        }
    }


    public void updateStockPrice(int updatedPrice){
        this.price = updatedPrice;
        this.notifyObservers();
    }

}
