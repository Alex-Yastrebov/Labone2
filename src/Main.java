import ru.ifmo.se.pokemon.*;
import Pokemons.*;

public class Main {
    public static void main(String[] args) {
        Battle WAR = new Battle();
        WAR.addAlly(new Raikou("Смаук", 1));
        WAR.addAlly(new Crabrawler("Сириус", 1));
        WAR.addAlly(new Crabominable("Риностар", 1));

        WAR.addFoe(new Seedot("Вотэрбайт", 1));
        WAR.addFoe(new Shiftry("Баблбайт", 1));
        WAR.addFoe(new Nuzleaf("Айрозар", 1));

        WAR.go();
    }
}