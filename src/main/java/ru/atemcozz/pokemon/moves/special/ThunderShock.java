package ru.atemcozz.pokemon.moves.special;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

//Inflicts regular damage. Has a 10% chance to paralyze the target.

public class ThunderShock extends SpecialMove {
    public static final double PARALYZING_CHANCE = 0.1;

    public ThunderShock() {
        super(Type.ELECTRIC, 40, 100);
    }

    private boolean canParalyzeTarget = false;

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        canParalyzeTarget = false;
        if (Math.random() <= PARALYZING_CHANCE) {
            canParalyzeTarget = true;
            Effect.paralyze(pokemon);
        }
    }

    @Override
    protected String describe() {
        return canParalyzeTarget ? "использует Thunder Shock и парализует цель" : "использует Thunder Shock";
    }
}
