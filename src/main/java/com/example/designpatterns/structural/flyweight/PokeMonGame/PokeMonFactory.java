package com.example.designpatterns.structural.flyweight.PokeMonGame;


import java.util.HashMap;
import java.util.Map;

public class PokeMonFactory {

   private static final Map<String,PokeMonFlyweight> registry = new HashMap<>();
    public static PokeMonFlyweight getPokeMonFlyweight(String species) {
        PokeMonFlyweight pokeMonFlyweight = registry.get(species);
        if(pokeMonFlyweight == null)
        {
            switch (species) {
                case "Pikachu":
                    pokeMonFlyweight = new PokeMonFlyweight("Pikachu", "Electric", new String[]{"Quick Attack", "ThunderBolt"});
                    break;
                case "Charmander" :
                    pokeMonFlyweight = new PokeMonFlyweight("Charmander", "Fire", new String[]{"Growl", "Flame Thrower"});
                    break;

            }
            registry.put(species,pokeMonFlyweight);
        }
        return pokeMonFlyweight;

    }


}
