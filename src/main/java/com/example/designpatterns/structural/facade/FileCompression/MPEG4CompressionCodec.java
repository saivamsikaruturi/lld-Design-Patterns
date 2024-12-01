package com.example.designpatterns.structural.facade.FileCompression;

public class MPEG4CompressionCodec implements CompressionCodec {
    @Override
    public String getType() {
        return "mp4";
    }
}