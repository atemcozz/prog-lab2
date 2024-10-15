package ru.atemcozz.pokemon.pokemons;

import ru.atemcozz.pokemon.moves.physical.Facade;
import ru.atemcozz.pokemon.moves.special.EarthPower;
import ru.atemcozz.pokemon.moves.special.ThunderShock;
import ru.atemcozz.pokemon.moves.status.Rest;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Stunfisk extends Pokemon {
    public Stunfisk(String name, int level) {
        super(name, level);
        this.setType(Type.GROUND, Type.ELECTRIC);
        this.setStats(109, 66, 84, 81, 99, 32);
        this.setMove(new Rest(), new Facade(), new ThunderShock(), new EarthPower());
    }
}
