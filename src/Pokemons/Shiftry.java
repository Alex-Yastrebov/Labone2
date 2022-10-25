package Pokemons;
import ru.ifmo.se.pokemon.Type;
import Moves.*;
public class Shiftry extends Nuzleaf {
    public Shiftry(String name, int level){
        super(name, level);
        setStats(90,100,60,90,60,80);
        setType(Type.GRASS, Type.DARK);
        setMove(new Swagger(), new Facade(), new Harden());
    }
}
