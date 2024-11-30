package com.example.designpatterns.creational.prototype.Netflix;

public class Driver {
    public static void main(String[] args) throws CloneNotSupportedException {
        Movie movie = new Movie("Devara","Siva","Telugu","2:30");
        Movie kannadaMovie = movie.clone();
        kannadaMovie.setLanguage("Kannada");

        System.out.println(movie);
        System.out.println(kannadaMovie);
    }
}