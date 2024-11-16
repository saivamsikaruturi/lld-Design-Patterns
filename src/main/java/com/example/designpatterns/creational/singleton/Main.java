package com.example.designpatterns.creational.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton.hashCode());
        System.out.println(singleton1.hashCode());
    }
}
