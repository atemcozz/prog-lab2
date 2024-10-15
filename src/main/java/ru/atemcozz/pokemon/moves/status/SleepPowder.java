package ru.atemcozz.pokemon.moves.status;

import ru.ifmo.se.pokemon.*;

/*
    Sleep Powder puts the target to sleep, if it hits.
    Sleep lasts for 1-3 turns.
 */
public class SleepPowder extends StatusMove {
    public static final int SLEEP_MIN_TURNS = 1;
    public static final int SLEEP_MAX_TURNS = 3;

    public SleepPowder() {
        super(Type.GRASS, 0, 75);
    }

    private int turnsCount = 0;

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        turnsCount = (int) Math.round(Math.random() * (SLEEP_MAX_TURNS - 1) + SLEEP_MIN_TURNS);
        var effect = new Effect()
                .condition(Status.SLEEP)
                .turns(turnsCount);
        pokemon.addEffect(effect);

    }

    @Override
    protected String describe() {
        return "использует Sleep Powder, усыпляя цель на " + turnsCount + " ходов";
    }
}
