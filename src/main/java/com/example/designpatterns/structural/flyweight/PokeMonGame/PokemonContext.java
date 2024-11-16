package com.example.designpatterns.structural.flyweight.PokeMonGame;

public class PokemonContext {

    private final int level;
    private final int health;
    private final String location;

    private final PokeMonFlyweight pokeMonFlyweight;

    public PokemonContext(int level, int health, String location, PokeMonFlyweight pokeMonFlyweight) {
        this.level = level;
        this.health = health;
        this.location = location;
        this.pokeMonFlyweight = pokeMonFlyweight;
    }

     void display(){
        pokeMonFlyweight.displayPokeMon(level,health,location);
     }
}
