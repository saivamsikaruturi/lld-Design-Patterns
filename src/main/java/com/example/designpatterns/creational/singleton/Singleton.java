package com.example.designpatterns.creational.singleton;

public class Singleton {

    private static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {

        if(instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {

                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}

/*
The double-checked locking pattern is necessary in a singleton pattern to ensure that the singleton instance is created only once, even in a multithreaded environment, while also avoiding the overhead of synchronization for every call to getInstance().

Here's how it works and why it's needed:

First Check (Outside Synchronized Block):
The first if (instance == null) check is outside the synchronized block. This allows threads to check if the instance is already created without requiring synchronization. Once the instance is initialized, all subsequent calls to getInstance() can avoid the synchronized block, thus improving performance.

Synchronized Block (for Thread Safety):
When instance is null, the synchronized block is entered, ensuring that only one thread at a time can initialize the instance.

Second Check (Inside Synchronized Block):
After entering the synchronized block, we check if (instance == null) again. This is essential because multiple threads could have passed the first check before one of them enters the synchronized block. Without this second check, multiple instances of Singleton could be created by different threads, violating the singleton property.

Why Double-Checked Locking Is Important
Without double-checked locking, if multiple threads enter the if (instance == null) check at the same time, they might each create separate instances of Singleton. Double-checked locking provides:

Thread safety by ensuring only one instance is created.
Performance optimization by avoiding synchronization after the instance is initialized.
 */
