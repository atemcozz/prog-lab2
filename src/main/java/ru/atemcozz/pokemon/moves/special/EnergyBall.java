package ru.atemcozz.pokemon.moves.special;

import ru.ifmo.se.pokemon.*;

/*
    Inflicts regular damage.
    Has a 10% chance to lower the target's Special Defense by one stage.
 */
public class EnergyBall extends SpecialMove {

    private static final double DEF_LOWERING_CHANCE = 0.1;

    public EnergyBall() {
        super(Type.GRASS, 90, 100);
    }


    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect effect = new Effect().chance(DEF_LOWERING_CHANCE).stat(Stat.SPECIAL_DEFENSE, -1).turns(-1);
        pokemon.addEffect(effect);
    }

    @Override
    protected String describe() {
        return "использует Energy Ball";
    }
}
