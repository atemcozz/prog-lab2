package ru.atemcozz.pokemon.moves.status;

import ru.ifmo.se.pokemon.*;

//Raises the user's Attack and Special Attack by one stage.

public class Growth extends StatusMove {
    public Growth() {
        super(Type.NORMAL, 0, 0);
    }


    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.ATTACK, 1);
        pokemon.setMod(Stat.SPECIAL_ATTACK, 1);

    }

    @Override
    protected String describe() {
        return "использует Growth";
    }
}
