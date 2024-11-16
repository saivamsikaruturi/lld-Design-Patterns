package com.example.designpatterns.structural.decorator.spotify;

public class OfflineDownloadDecorator implements MusicStream{


    private MusicStream musicStream;

    public OfflineDownloadDecorator(MusicStream musicStream) {
        this.musicStream = musicStream;
    }

    @Override
    public void play() {
        musicStream.play();
        System.out.println("Offline download enabled");
    }
}
