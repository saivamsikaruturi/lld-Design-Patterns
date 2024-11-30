package com.example.designpatterns.creational.builder.AmazonOrders;

public class Driver {
    public static void main(String[] args) {
        Order order = new Order.OrderBuilder("1",1000.0,"UPI","Hyd","Hyd","Laptop","144167")
                .setDiscountCode("VAMSI250").build();
        System.out.println(order);
    }
}
