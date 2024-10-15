package ru.atemcozz.pokemon.moves.status;

import ru.ifmo.se.pokemon.*;

//User sleeps for two turns, completely healing itself.

public class Rest extends StatusMove {
    public static final int SLEEP_TURNS = 2;

    public Rest() {
        super(Type.PSYCHIC, 0, 0);
    }


    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        var effect = new Effect()
                .condition(Status.SLEEP)
                .turns(SLEEP_TURNS);
        pokemon.addEffect(effect);
        pokemon.setMod(Stat.HP, (int) -(pokemon.getStat(Stat.HP) - pokemon.getHP()));

    }

    @Override
    protected String describe() {
        return "использует Rest";
    }
}
