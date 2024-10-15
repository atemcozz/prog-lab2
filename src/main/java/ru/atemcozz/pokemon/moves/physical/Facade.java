package ru.atemcozz.pokemon.moves.physical;

import ru.ifmo.se.pokemon.*;

/*
    Inflicts regular damage.
    If the user is burned, paralyzed, or poisoned, this move has double power.
*/

public class Facade extends PhysicalMove {
    public static final int SP_CONDITION_MULTIPLIER = 2;

    public Facade() {
        super(Type.NORMAL, 70, 100);
    }

    private boolean hasSpecialCondition = false;


    @Override
    protected void applyOppDamage(Pokemon pokemon, double damage) {
        Status cond = pokemon.getCondition();
        hasSpecialCondition = cond == Status.BURN || cond == Status.PARALYZE || cond == Status.POISON;
        double multiplier = hasSpecialCondition ? SP_CONDITION_MULTIPLIER : 1;
        pokemon.setMod(Stat.HP, (int) (damage * multiplier));
    }


    @Override
    protected String describe() {
        return hasSpecialCondition
                ? "использует Facade с двойной силой"
                : "использует Facade";
    }
}
