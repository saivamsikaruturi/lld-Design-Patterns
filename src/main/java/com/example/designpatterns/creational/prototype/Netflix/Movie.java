package com.example.designpatterns.creational.prototype.Netflix;

public class Movie implements Cloneable{
    private String title;
    private String director;
    private String language;
    private String duration;

    public Movie(String title, String director, String language, String duration) {
        this.title = title;
        this.director = director;
        this.language = language;
        this.duration = duration;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    protected Movie clone() throws CloneNotSupportedException {
        return (Movie) super.clone();
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", language='" + language + '\'' +
                ", duration='" + duration + '\'' +
                '}';
    }
}
