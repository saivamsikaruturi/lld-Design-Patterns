package com.example.designpatterns.structural.facade.FileCompression.withfacade;




import com.example.designpatterns.structural.facade.FileCompression.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;

public class VideoConverterFacade {

    VideoConverterFacade(){

    }

    public File convert(String filename, String format) throws FileNotFoundException, FileNotFoundException {

        VideoFile file = new VideoFile(filename);
        File sourceCodec = CodecFactory.extract(file);
        CompressionCodec destinationCodec = null;
        if (format.equals("mp4"))
            destinationCodec = new MPEG4CompressionCodec();
        else
            destinationCodec = new OggCompressionCodec();

        BufferedReader buffer = BitrateReader.read(filename, sourceCodec);
        File desFile = BitrateReader.convert(buffer, destinationCodec);
        File result = (new AudioMixer()).fix(desFile);
        return result;
    }
}