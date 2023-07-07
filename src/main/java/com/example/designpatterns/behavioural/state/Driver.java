package com.example.designpatterns.behavioural.state;

public class Driver {
    public static void main(String[] args) {
        Package pkg = new Package();
        pkg.printStatus();
        pkg.nextState();
        pkg.printStatus();
        pkg.nextState();
        pkg.printStatus();
    }
}
