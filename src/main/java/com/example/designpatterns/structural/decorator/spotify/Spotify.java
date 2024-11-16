package com.example.designpatterns.structural.decorator.spotify;

public class Spotify implements MusicStream{

    @Override
    public void play() {
        System.out.println("playing song");
    }
}
