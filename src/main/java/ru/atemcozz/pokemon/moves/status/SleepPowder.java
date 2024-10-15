package ru.atemcozz.pokemon.moves.status;

import ru.ifmo.se.pokemon.*;

/*
    Sleep Powder puts the target to sleep, if it hits.
    Sleep lasts for 1-3 turns.
 */
public class SleepPowder extends StatusMove {
    private static final int SLEEP_MIN_TURNS = 1;
    private static final int SLEEP_MAX_TURNS = 3;

    public SleepPowder() {
        super(Type.GRASS, 0, 75);
    }


    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        int turnsCount = (int) Math.round(Math.random() * (SLEEP_MAX_TURNS - 1) + SLEEP_MIN_TURNS);
        Effect condition = new Effect()
                .condition(Status.SLEEP)
                .turns(turnsCount);
        pokemon.addEffect(condition);

    }

    @Override
    protected String describe() {
        return "использует Sleep Powder";
    }
}
