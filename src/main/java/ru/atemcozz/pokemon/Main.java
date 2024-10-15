package ru.atemcozz.pokemon;


import ru.atemcozz.pokemon.pokemons.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;



public class Main {
    static void shuffle(Pokemon[] pokemons) {
        for (int i = 0; i < pokemons.length - 1; i++) {
            int a = (int) (Math.random() * pokemons.length);
            int b = (int) (Math.random() * pokemons.length);
            Pokemon temp = pokemons[a];
            pokemons[a] = pokemons[b];
            pokemons[b] = temp;
        }
    }
    public static void main(String[] args) {
        Battle battle = new Battle();
        Pokemon[] pokemons = new Pokemon[]{
                new Stunfisk("Stunfisk", 1),
                new Cranidos("Cranidos", 1),
                new Rampardos("Rampardos", 1),
                new Bellsprout("Bellsprout", 1),
                new Weepinbell("Weepinbell", 1),
                new Victreebel("Victreebel", 1),
        };
        shuffle(pokemons);
        for(int i = 0; i < pokemons.length / 2; i++) {
            battle.addAlly(pokemons[i]);
            battle.addFoe(pokemons[pokemons.length - i - 1]);
        }


        battle.go();

    }
}
