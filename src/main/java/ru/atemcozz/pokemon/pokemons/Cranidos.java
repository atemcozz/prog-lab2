package ru.atemcozz.pokemon.pokemons;

import ru.atemcozz.pokemon.moves.physical.Facade;
import ru.atemcozz.pokemon.moves.status.FocusEnergy;
import ru.atemcozz.pokemon.moves.status.Swagger;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Cranidos extends Pokemon {
    public Cranidos(String name, int level) {
        super(name, level);
        this.setType(Type.ROCK);
        this.setStats(67, 125, 40, 30, 30, 58);
        this.setMove(new Facade(), new FocusEnergy(), new Swagger());
    }
}
