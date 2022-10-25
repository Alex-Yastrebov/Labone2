package Moves;
import ru.ifmo.se.pokemon.*;
public class ThunderShock extends SpecialMove{
    public ThunderShock(){
        super(Type.ELECTRIC, 0, 85);
    }
    protected String describe(){
        return "использует ThunderShock";
    }
    protected void applyOppEffects(Pokemon var1){
        if (Math.random() <= 0.3) Effect.paralyze(var1);
    }
}
