package com.example.designpatterns.behavioural.state;

public class ReceivedState implements PackageState {
    @Override
    public void next(Package pkg) {
        System.out.println("Package has been delivered");
    }

    @Override
    public void prev(Package pkg) {
     pkg.setState(new DeliveredState());
    }

    @Override
    public void printStatus() {
        System.out.println("package received");
    }
}
