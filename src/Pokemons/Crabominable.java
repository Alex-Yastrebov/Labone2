package Pokemons;
import ru.ifmo.se.pokemon.*;
import Moves.*;
public class Crabominable extends Crabrawler{
    public Crabominable (String name, int level) {
        super(name, level);
        setStats(97,132,77,62,67,43);
        setType(Type.ICE);
        setMove(new IceBeam());
    }
}