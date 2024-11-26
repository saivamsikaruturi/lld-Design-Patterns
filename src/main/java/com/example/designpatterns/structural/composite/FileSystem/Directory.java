package com.example.designpatterns.structural.composite.FileSystem;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{

    String directoryName;
    List<FileSystem> fileSystemList;

    public Directory(String directoryName) {
        this.directoryName = directoryName;
        this.fileSystemList = new ArrayList<>();
    }

      public void  add(FileSystem file){
        fileSystemList.add(file);
      }

    @Override
    public void ls() {
        System.out.println("directory name:"+directoryName);
        for(FileSystem fileSystem : fileSystemList){
            fileSystem.ls();
        }
    }
}
