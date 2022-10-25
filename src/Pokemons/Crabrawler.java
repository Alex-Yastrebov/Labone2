package Pokemons;
import ru.ifmo.se.pokemon.*;
import Moves.*;
public class Crabrawler extends Pokemon {
    public Crabrawler (String name, int level){
        super(name, level);
        setStats(47,82,57,42,47,63);
        setType(Type.FIGHTING);
        setMove(new Bulldoze(), new DizzyPunch(), new IronDefense());
    }
}
