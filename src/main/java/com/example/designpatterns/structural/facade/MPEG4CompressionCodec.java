package com.example.designpatterns.structural.facade;

public class MPEG4CompressionCodec implements CompressionCodec {
    @Override
    public String getType() {
        return "mp4";
    }
}