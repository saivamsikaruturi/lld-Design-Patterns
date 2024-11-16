package com.example.designpatterns.structural.decorator.spotify;

public class Main {
    public static void main(String[] args) {
        MusicStream spotify = new OfflineDownloadDecorator(new HAAudioDecorator(new Spotify()));
        spotify.play();

    }
}
