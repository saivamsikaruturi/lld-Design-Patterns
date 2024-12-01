package com.example.designpatterns.structural.proxy.AmazonReviewsVirtualProxy;

interface Book {
   String getName();
   String getAuthor();
   boolean isAvailable();
   void showInfo();
}