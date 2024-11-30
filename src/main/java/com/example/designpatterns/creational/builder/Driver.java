package com.example.designpatterns.creational.builder;

import com.example.designpatterns.creational.builder.AmazonOrders.Order;

public class Driver {
    public static void main(String[] args) {
        User user = new User.UserBuilder("Vamsi","Krishna").build();
        System.out.println(user);


        user = new User.UserBuilder("Vamsi","Krishna").setAge(24).setPhone("9999999999").build();
        System.out.println(user);

         Order order = new Order.OrderBuilder("1",1000.0,"UPI","Hyd","Hyd","Laptop","144167")
                 .setDiscountCode("VAMSI250").build();
        System.out.println(order);
    }
}
