package no.ntnu.idatx2001.oblig3.wargames;

/**
 * Commander unit arver alle egenskapene sine fra Cavalry Unit.
 */

public class CommanderUnit extends CavalryUnit {

    /**
     * Konstruktør
     * @param name navnet til uniten
     * @param health livet til uniten
     * @param armor rustningen til uniten
     * @param attack angrepet til uniten
     */

    public CommanderUnit(String name, int health, int armor, int attack, Terrain terrain) {
        super(name,health,attack,armor, terrain);
    }

    /**
     * Forenklet konstruktør med angrep (attack) satt lik 25 og rustning (armor) lik 15.
     * @param name navnet til uniten
     * @param health livet til uniten
     */

    public CommanderUnit(String name, int health) {
        super(name, health, 25, 15);
    }

}
