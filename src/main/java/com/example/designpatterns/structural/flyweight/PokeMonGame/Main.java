package com.example.designpatterns.structural.flyweight.PokeMonGame;

public class Main {
    public static void main(String[] args) {
        PokeMonFlyweight pokeMonFlyweight = PokeMonFactory.getPokeMonFlyweight("Pikachu");
        PokemonContext pikachu = new PokemonContext(10,35,"Hyderabad",pokeMonFlyweight);
        PokemonContext pikachu1 = new PokemonContext(10,35,"Vijayawada",pokeMonFlyweight);
        pikachu1.display();
        pikachu.display();
    }
}
