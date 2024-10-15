package ru.atemcozz.pokemon.pokemons;

import ru.atemcozz.pokemon.moves.special.EnergyBall;
import ru.atemcozz.pokemon.moves.status.Rest;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Bellsprout extends Pokemon {
    public Bellsprout(String name, int level) {
        super(name, level);
        this.setType(Type.GRASS, Type.POISON);
        this.setStats(50, 75, 35, 70, 30, 40);
        this.setMove(new Rest(), new EnergyBall());
    }
}
