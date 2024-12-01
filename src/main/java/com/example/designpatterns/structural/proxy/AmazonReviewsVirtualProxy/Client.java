package com.example.designpatterns.structural.proxy.AmazonReviewsVirtualProxy;

public class Client {
    public static void main(String[] args) {
        Book originalBook = new OriginalBook("James Clear",true,"Tiny Changes","Atomic Habits",5);

        Book book = new ProxyBook(originalBook);

        book.showInfo();

        ((ProxyBook)book).click(); // shows entire review when clicking and asking to send complete review.

    }
}
