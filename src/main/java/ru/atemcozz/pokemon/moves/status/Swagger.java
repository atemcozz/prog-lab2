package ru.atemcozz.pokemon.moves.status;

import ru.ifmo.se.pokemon.*;

/*
    Raises the target's Attack by two stages, then confuses it.
*/

public class Swagger extends StatusMove {
    public Swagger() {
        super(Type.NORMAL, 0, 85);
    }


    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.ATTACK, 2);
        Effect.confuse(pokemon);

    }

    @Override
    protected String describe() {
        return "использует Swagger";
    }
}
