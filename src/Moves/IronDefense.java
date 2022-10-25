package Moves;

import ru.ifmo.se.pokemon.*;

public class IronDefense extends StatusMove {
    public IronDefense() {super(Type.NORMAL, 0,0);}
    protected String describe() {return "использует IronDefense";}
    protected void applyOppEffects(Pokemon var1) {
        var1.setCondition(new Effect().stat(Stat.DEFENSE, +2));
    }
}

