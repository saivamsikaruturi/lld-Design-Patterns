package com.example.designpatterns.structural.facade.FileCompression;

public class OggCompressionCodec implements CompressionCodec {

    @Override
    public String getType() {
        return "ogg";
    }
}