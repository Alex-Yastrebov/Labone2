package Moves;

import ru.ifmo.se.pokemon.*;

public class WildCharge extends PhysicalMove {
    private double attack;
    public WildCharge () {
        super(Type.ELECTRIC, 90, 100);
    }
    protected String describe() {
        return "использует WildCharge";
    }
    protected void applySelfDamage(Pokemon pokemon, double v) {
        this.attack = pokemon.getStat(Stat.ATTACK);
        super.applySelfDamage(pokemon, this.attack * 1/4);
    }
}
