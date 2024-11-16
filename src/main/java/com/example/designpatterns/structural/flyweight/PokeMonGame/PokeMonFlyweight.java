package com.example.designpatterns.structural.flyweight.PokeMonGame;

import java.util.Arrays;

public class PokeMonFlyweight {
    private final String species;
    private  final String type;
    private final String[] moveSet;

    public PokeMonFlyweight(String species, String type, String[] moveSet) {
        this.species = species;
        this.type = type;
        this.moveSet = moveSet;
    }

    public void displayPokeMon(int level,int health,String location){

        System.out.println("species:"+species);
        System.out.println("type:"+type);
        Arrays.stream(moveSet).forEach(System.out::println);

        System.out.println("level::"+level);
        System.out.println("health::"+health);
        System.out.println("location::"+location);
    }

}
