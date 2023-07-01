package com.example.designpatterns.behavioural.observer;



public interface Observable {
    public void registerObserver(Observer observer);

    public void notifyObservers();

    public void removeObserver(Observer observer);
}
