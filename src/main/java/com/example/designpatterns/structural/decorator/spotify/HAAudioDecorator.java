package com.example.designpatterns.structural.decorator.spotify;

public class HAAudioDecorator implements MusicStream{
    private MusicStream musicStream;

    public HAAudioDecorator(MusicStream musicStream) {
        this.musicStream = musicStream;
    }

    @Override
    public void play() {
        musicStream.play();
        System.out.println("HQ Audio enabled");
    }

}
