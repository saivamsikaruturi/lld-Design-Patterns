package com.example.designpatterns.behavioural.observer.zerodha;

public class Main {
    public static void main(String[] args) {
        StockPricePublisher stockPricePublisher = new StockPricePublisher();

        WebAppObserver webAppObserver = new WebAppObserver();
        MobileAppObserver mobileAppObserver = new MobileAppObserver();
        stockPricePublisher.subscribe(webAppObserver);
        stockPricePublisher.subscribe(mobileAppObserver);
        stockPricePublisher.setPrice(100);
    }
}
