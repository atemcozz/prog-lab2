package ru.atemcozz.pokemon.pokemons;

import ru.atemcozz.pokemon.moves.special.EnergyBall;
import ru.atemcozz.pokemon.moves.status.Growth;
import ru.atemcozz.pokemon.moves.status.Rest;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Weepinbell extends Pokemon {
    public Weepinbell(String name, int level) {
        super(name, level);
        this.setType(Type.GRASS, Type.POISON);
        this.setStats(65, 90, 50, 85, 45, 55);
        this.setMove(new Rest(), new EnergyBall(), new Growth());
    }
}
