package com.example.designpatterns.creational.builder.UserProfileCreation;

public class Driver {
    public static void main(String[] args) {
        User user = new User.UserBuilder("Vamsi","Krishna").build();
        System.out.println(user);


        user = new User.UserBuilder("Vamsi","Krishna").setAge(24).setPhone("9999999999").build();
        System.out.println(user);


    }
}
