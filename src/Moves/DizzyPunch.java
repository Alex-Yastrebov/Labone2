package Moves;

import ru.ifmo.se.pokemon.*;

public class DizzyPunch extends PhysicalMove {
    public DizzyPunch(){
        super(Type.NORMAL, 70,100);
    }

    protected String describe(){
        return "использует DizzyPunch";
    }

    protected void applyOppEffects(Pokemon var1){
        if (Math.random() <= 0.2) Effect.confuse(var1);
    }
}
