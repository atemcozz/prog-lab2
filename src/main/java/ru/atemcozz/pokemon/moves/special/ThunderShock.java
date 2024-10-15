package ru.atemcozz.pokemon.moves.special;

import ru.ifmo.se.pokemon.*;

//Inflicts regular damage. Has a 10% chance to paralyze the target.

public class ThunderShock extends SpecialMove {
    private static final double PARALYZING_CHANCE = 0.1;

    public ThunderShock() {
        super(Type.ELECTRIC, 40, 100);
    }


    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect condition = new Effect().chance(PARALYZING_CHANCE).condition(Status.PARALYZE).turns(-1);
        pokemon.setCondition(condition);
    }

    @Override
    protected String describe() {
        return "использует Thunder Shock";
    }
}
