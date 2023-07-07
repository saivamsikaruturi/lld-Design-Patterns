package com.example.designpatterns.behavioural.state;

public interface PackageState {
    void next(Package pkg);
    void prev(Package pkg);
    void printStatus();
}
