package ru.atemcozz.pokemon.moves.status;

import ru.ifmo.se.pokemon.*;

/*
    User's critical hit rate is two levels higher until it leaves the field.
 */

public class FocusEnergy extends StatusMove {
    public FocusEnergy() {
        super(Type.NORMAL, 0, 0);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.SPEED, 2);
    }

    @Override
    protected String describe() {
        return "использует Focus Energy";
    }
}
