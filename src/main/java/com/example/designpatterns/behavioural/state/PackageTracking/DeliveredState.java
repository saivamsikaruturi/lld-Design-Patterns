package com.example.designpatterns.behavioural.state.PackageTracking;

public class DeliveredState implements PackageState {
    @Override
    public void next(Package pkg) {
      pkg.setState(new ReceivedState());
    }

    @Override
    public void prev(Package pkg) {
     pkg.setState(new OrderedState());
    }

    @Override
    public void printStatus() {
        System.out.println("Package received to destination office, not delivered yet");
    }
}
