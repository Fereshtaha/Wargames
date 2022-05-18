package no.ntnu.idatx2001.oblig3.wargames;

/**
 * Infantry unit klassen returnerer attack bonus 2 og resist bonus 1.
 */

public class InfantryUnit extends Unit {

    /**
     * @param name navnet til uniten
     * @param health livet til uniten
     * @param armor rustningen til uniten
     * @param attack angrepet til uniten
     */

    public InfantryUnit(String name, int health, int armor, int attack, Terrain terrain) {
        super(name, health, attack, armor, terrain);
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
     * @return hvis det er skog, så returnerer den 4. Ellers returnerer den 2.
     */
    public int getAttackBonus() {
        if (getTerrain() == Terrain.FOREST) {
            return 4;
        } else {
            return 2;
        }
    }

    /**
     * Får resist bonusen
     * @return hvis det er skog, så returnerer den 2. Ellers returnerer den 2.
     */
    public int getResistBonus() {
        if (getTerrain() == Terrain.FOREST) {
            return 2;
        } else {
            return 1;
        }
    }

}
