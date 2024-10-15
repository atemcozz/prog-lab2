package ru.atemcozz.pokemon.pokemons;

import ru.atemcozz.pokemon.moves.special.EnergyBall;
import ru.atemcozz.pokemon.moves.status.Growth;
import ru.atemcozz.pokemon.moves.status.Rest;
import ru.atemcozz.pokemon.moves.status.SleepPowder;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Victreebel extends Pokemon {
    public Victreebel(String name, int level) {
        super(name, level);
        this.setType(Type.GRASS, Type.POISON);
        this.setStats(80, 105, 65, 100, 70, 70);
        this.setMove(new Rest(), new EnergyBall(), new Growth(), new SleepPowder());
    }
}
