package com.example.designpatterns.creational.builder;

public class Driver {
    public static void main(String[] args) {
        User user = new User.UserBuilder("LavaKumar","T").build();
        System.out.println(user);


        user = new User.UserBuilder("LavaKumar","T").setAge(24).setPhone("9890098900").build();
        System.out.println(user);
    }
}
