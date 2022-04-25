package no.ntnu.idatx2001.oblig3.wargames;

/**
 * Infantry unit klassen returnerer attack bonus 2 og resist bonus 1.
 */

public class InfantryUnit extends Unit {

    /**
     *
     * @param name navnet til uniten
     * @param health livet til uniten
     * @param armor rustningen til uniten
     * @param attack angrepet til uniten
     */

    public InfantryUnit(String name, int health, int armor, int attack) {
        super(name, health, attack, armor);
    }

    /**
     * Konstruktør med attack satt lik 15 og armor lik 10.
     * @param name navnet til uniten
     * @param health health til uniten
     */
    public InfantryUnit(String name, int health) {
        super(name, health, 15, 10);
    }

    /**
     * Får attack bonusen
     * @return int 2
     */
    public int getAttackBonus() {
        return 2;
    }

    /**
     * Får resist bonusen
     * @return int 1
     */
    public int getResistBonus() {
        return 1;
    }

}
