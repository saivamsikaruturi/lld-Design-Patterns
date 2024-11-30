package com.example.designpatterns.behavioural.state.PackageTracking;

public class OrderedState implements PackageState {
    @Override
    public void next(Package pkg) {
        pkg.setState((new DeliveredState()));
    }

    @Override
    public void prev(Package pkg) {
        System.out.println("The package is not yet ordered");
    }

    @Override
    public void printStatus() {
        System.out.println("The package is ordered , not delivered to office yet");
    }
}
