package Moves;


import ru.ifmo.se.pokemon.*;

public class IceBeam extends SpecialMove {
    public IceBeam(){
        super(Type.ICE, 90,100);
    }

    protected String describe(){
        return "использует IceBeam";
    }

    protected void applyOppEffects(Pokemon var1){
        if (Math.random() <= 0.1) Effect.freeze(var1);
    }
}
