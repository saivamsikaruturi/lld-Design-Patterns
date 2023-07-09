package com.example.designpatterns.behavioural.iterator;

public interface InputIterator<E> {

    boolean hasNext();

    E next();
}