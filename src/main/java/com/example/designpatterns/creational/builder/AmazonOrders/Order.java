package com.example.designpatterns.creational.builder.AmazonOrders;

import java.util.Date;

public class Order {
    private String orderId;
    private String customerId;
    private String orderItems;
    private String shippingAddress;
    private String billingAddress;
    private String paymentMethod;
    private double totalAmount;

    // Optional parameters
    private String discountCode;             // Optional
    private boolean giftWrap;                // Optional
    private String customerNotes;            // Optional
    private Date preferredDeliveryDate;

    public Order(OrderBuilder orderBuilder) {
        this.orderId = orderBuilder.orderId;
        this.customerId = orderBuilder.customerId;
        this.orderItems = orderBuilder.orderItems;
        this.shippingAddress = orderBuilder.shippingAddress;
        this.billingAddress = orderBuilder.billingAddress;
        this.paymentMethod = orderBuilder.paymentMethod;
        this.totalAmount =orderBuilder.totalAmount;
        this.discountCode = orderBuilder.discountCode;
        this.giftWrap =  orderBuilder.giftWrap;
        this.customerNotes =  orderBuilder.customerNotes;
        this.preferredDeliveryDate =  orderBuilder.preferredDeliveryDate;
    }

    public static  class OrderBuilder{


        private String orderId;
        private String customerId;
        private String orderItems;
        private String shippingAddress;
        private String billingAddress;
        private String paymentMethod;
        private double totalAmount;

        // Optional parameters
        private String discountCode;             // Optional
        private boolean giftWrap;                // Optional
        private String customerNotes;            // Optional
        private Date preferredDeliveryDate;

        public OrderBuilder(String orderId, double totalAmount, String paymentMethod, String billingAddress, String shippingAddress, String orderItems, String customerId) {
            this.orderId = orderId;
            this.totalAmount = totalAmount;
            this.paymentMethod = paymentMethod;
            this.billingAddress = billingAddress;
            this.shippingAddress = shippingAddress;
            this.orderItems = orderItems;
            this.customerId = customerId;
        }

        public OrderBuilder setDiscountCode(String discountCode){
            this.discountCode = discountCode;
            return this;
        }

        public Order build(){
            return  new Order(this);
        }

    }
}
