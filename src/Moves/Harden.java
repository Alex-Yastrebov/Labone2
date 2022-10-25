package Moves;

import ru.ifmo.se.pokemon.*;

public class Harden extends StatusMove {
    public Harden(){
        super(Type.NORMAL, 0, 0);
    }
    protected String describe(){
        return "использует Harden";
    }
    protected void applyOppEffects(Pokemon var1) {
        var1.setCondition(new Effect().stat(Stat.DEFENSE, +1));
    }
}
