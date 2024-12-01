package com.example.designpatterns.structural.facade.FileCompression;

import java.io.File;

public class CodecFactory {

    public static File extract(VideoFile file){
        return new File("src/main/java/com/example/designpatterns/structural/facade/FileCompression/codec_file.ogg");
    }
}