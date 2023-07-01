package com.example.designpatterns.structural.facade;

import java.io.File;

public class CodecFactory {

    public static File extract(VideoFile file){
        return new File("src/main/java/DesignPatterns/Structural/Facade/codec_file.ogg");
    }
}