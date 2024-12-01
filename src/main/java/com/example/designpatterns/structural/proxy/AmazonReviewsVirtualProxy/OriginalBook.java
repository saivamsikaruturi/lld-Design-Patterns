package com.example.designpatterns.structural.proxy.AmazonReviewsVirtualProxy;

class OriginalBook implements Book {
    private String name;
    private String author;
    private String description;
    private int rating;
    private boolean available;

    public OriginalBook(String author, boolean available, String description, String name, int rating) {
        this.author = author;
        this.available = available;
        this.description = description;
        this.name = name;
        this.rating = rating;
    }



    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public boolean isAvailable() {
        return available;
    }

    @Override
    public String toString() {
        return "OriginalBook{" +
                "description='" + description + '\'' +
                ", author='" + author + '\'' +
                ", available=" + available +
                ", name='" + name + '\'' +
                ", rating=" + rating +
                '}';
    }

    @Override
    public void showInfo() {
        String info = toString();
        System.out.println(info);
    }


}
