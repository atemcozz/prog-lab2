package ru.atemcozz.pokemon.moves.special;

import ru.ifmo.se.pokemon.*;

/*
    Inflicts regular damage.
    Has a 10% chance to lower the target's Special Defense by one stage.
 */
public class EarthPower extends SpecialMove {
    public static final double DEF_LOWERING_CHANCE = 0.1;

    public EarthPower() {
        super(Type.GROUND, 90, 100);
    }

    private boolean canLowerSpDefence = false;

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        canLowerSpDefence = false;
        if (Math.random() <= DEF_LOWERING_CHANCE){
            canLowerSpDefence = true;
            pokemon.setMod(Stat.SPECIAL_DEFENSE, -1);
        }
    }

    @Override
    protected String describe() {
        return canLowerSpDefence
                ? "использует Earth Power и уменьшает Special Defense цели на 1"
                : "использует Earth Power";
    }
}
