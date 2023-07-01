package com.example.designpatterns.creational.abstractfactory.exception;

public class ObjectCreationException extends RuntimeException{

    public ObjectCreationException(String message){
        System.out.println(message+" Object Creation Failed");
    }
}