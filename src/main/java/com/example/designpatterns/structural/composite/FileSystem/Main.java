package com.example.designpatterns.structural.composite.FileSystem;

public class Main {
    public static void main(String[] args) {
        Directory music = new Directory("Music");
        FileSystem fileSystem = new File("Devara");
        FileSystem fileSystem1 = new File("Bahubali");
        music.add(fileSystem);
        music.add(fileSystem1);

         Directory directory = new Directory("Documents");
         FileSystem fileSystem2 = new File("Class 10");
         directory.add(fileSystem2);

         Directory main = new Directory("Main");
         main.add(new File("Resume"));
         main.add(music);
         main.add(directory);

         main.ls();
    }
}
