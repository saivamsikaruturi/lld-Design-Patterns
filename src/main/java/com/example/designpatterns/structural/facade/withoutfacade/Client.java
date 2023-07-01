package com.example.designpatterns.structural.facade.withoutfacade;



import com.example.designpatterns.structural.facade.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;

public class Client {
    /* without Facade Client need to manage all the subs systems overhead */
    public static void main(String[] args) throws FileNotFoundException {
        String filename = "latest-move.ogg";
        String format = "mp4";
        VideoFile file = new VideoFile(filename);
        File sourceCodec = CodecFactory.extract(file);
        CompressionCodec destinationCodec = null;
        if(format.equals("mp4")){
            destinationCodec = new MPEG4CompressionCodec();
        }
        else
            destinationCodec = new OggCompressionCodec();
        BufferedReader bufferedReader = BitrateReader.read(filename,sourceCodec);
        File desFile = BitrateReader.convert(bufferedReader,destinationCodec);
        File result = (new AudioMixer()).fix(desFile);
        System.out.println(result);

    }
}
