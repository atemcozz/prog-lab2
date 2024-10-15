package ru.atemcozz.pokemon.pokemons;

import ru.atemcozz.pokemon.moves.physical.Facade;
import ru.atemcozz.pokemon.moves.special.FocusBlast;
import ru.atemcozz.pokemon.moves.status.FocusEnergy;
import ru.atemcozz.pokemon.moves.status.Swagger;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Rampardos extends Pokemon {
    public Rampardos(String name, int level) {
        super(name, level);
        this.setType(Type.ROCK);
        this.setStats(97, 165, 60, 65, 50, 68);
        this.setMove(new Facade(), new FocusEnergy(), new Swagger(), new FocusBlast());
    }
}
