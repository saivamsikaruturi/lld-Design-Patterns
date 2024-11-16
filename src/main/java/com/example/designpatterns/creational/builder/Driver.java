package com.example.designpatterns.creational.builder;

import com.example.designpatterns.creational.builder.AmazonOrders.Order;

public class Driver {
    public static void main(String[] args) {
        User user = new User.UserBuilder("LavaKumar","T").build();
        System.out.println(user);


        user = new User.UserBuilder("LavaKumar","T").setAge(24).setPhone("9890098900").build();
        System.out.println(user);
        Car car = new Car.CarBuilder(3,"ab").build();

         Order order = new Order.OrderBuilder("1",1000.0,"UPI","Hyd","Hyd","Laptop","144167")
                 .setDiscountCode("VAMSI250").build();
        System.out.println(order);
    }
}
