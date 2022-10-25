package Pokemons;
import ru.ifmo.se.pokemon.*;
import Moves.*;
public class Nuzleaf extends Seedot{
    public Nuzleaf(String name, int level){
        super(name, level);
        setStats(70,70,40,60,40,60);
        setType(Type.GRASS, Type.DARK);
        setMove(new Swagger(), new Facade(), new Harden());
    }
}
