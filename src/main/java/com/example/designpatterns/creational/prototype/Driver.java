package com.example.designpatterns.creational.prototype;

public class Driver {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee employee1 = new Employee(1,"Vamsi Krishna",24,10000000);

        System.out.println(employee1);
        System.out.println(employee1.hashCode());




        Employee employee2 = (Employee) employee1.clone();
        System.out.println(employee2);
        System.out.println(employee2.hashCode());

        Movie movie = new Movie("Devara","Siva","Telugu","2:30");
        Movie kannadaMovie = movie.clone();
        kannadaMovie.setLanguage("Kannada");

        System.out.println(movie);
        System.out.println(kannadaMovie);
    }
}