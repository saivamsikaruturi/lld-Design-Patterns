package com.example.designpatterns.behavioural.state.PackageTracking;

public class Package {
    private PackageState state;

    public Package() {
        this.state = new OrderedState();
    }
    public PackageState getState(){
        return state;
    }

    public void setState(PackageState state){
        this.state = state;
    }

    public void previousState(){
        state.prev(this);
    }

    public  void nextState(){
        state.next(this);
    }

    public void printStatus(){
        state.printStatus();
    }

}
