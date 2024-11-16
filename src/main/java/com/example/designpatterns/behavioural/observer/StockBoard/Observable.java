package com.example.designpatterns.behavioural.observer.StockBoard;

public interface Observable {
    public void registerObserver(Observer observer);

    public void notifyObservers();

    public void removeObserver(Observer observer);
}
