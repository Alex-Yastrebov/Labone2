package Pokemons;
import ru.ifmo.se.pokemon.*;
import Moves.*;
public class Raikou extends Pokemon {
    public Raikou (String name, int level){
        super(name, level);
        setStats(90,85,75,115,100,115);
        setType(Type.ELECTRIC);
        setMove(new Swagger(), new ThunderShock(), new WildCharge(), new QuickAttack());
    }
}
