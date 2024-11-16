package com.example.designpatterns.behavioural.visitor;

public interface Shape {
    void accept(ShapeVisitor visitor);
}