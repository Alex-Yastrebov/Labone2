package Moves;

import ru.ifmo.se.pokemon.*;

public class Bulldoze extends PhysicalMove {
    public Bulldoze () {
        super(Type.NORMAL, 60,100);
    }
    protected String describe() {
        return "использует Bulldoze ";
    }
    protected void applyOppEffects(Pokemon var1) {
        var1.setCondition(new Effect().stat(Stat.SPEED, -1));
    }
}
