package no.ntnu.idatx2001.oblig3.wargames;

/**
 * Ranged unit klassen returnerer attack bonus 3.
 * Resist bonusen er 6 første gangen, 4 andre gangen og 2 alle andre ganger.
 */

public class RangedUnit extends Unit{
    /**
     * Antall ganger man angriper vedkommende
     */
    private int numberOfTimes = 0;

    /**
     * Konstruktør med alle parametere.
     * @param name navnet til uniten
     * @param health livet til uniten
     * @param armor rustningen til uniten
     * @param attack hvor stor attack uniten har
     */

    public RangedUnit(String name, int health, int armor, int attack, Terrain terrain) {
        super(name, health, armor, attack, terrain);
    }


    /** forenklet konstruktør med attack satt lik 15 og armor lik 8.
     *
     */
    public RangedUnit(String name, int health) {
        super(name, health, 15, 8);
    }

    /** fordel fordi den kan angripe fra en avstand
     * Returnerer attack bonusen.
     * @return hvis det er en ås, så returnerer den 4. Hvis det er en skog, så returnerer den 2.
     * Ellers returnerer den 3.
     */
    public int getAttackBonus() {
        if (terrain == Terrain.HILL) {
            return 4;
        }
        if (terrain == Terrain.FOREST) {
            return 2;
        }
        else {
            return 3;
        }
    }


    /** Basert på avstanden på fienden. Returnerer en betydelig verdi første gangen enheten blir angrepet
     * (f.eks. 6).
     * Verdien blir redusert neste gang den blir angrepet (til f.eks. 4).
     * Fra og med det tredje angrepet skal det returneres en standard
     * verdi (f.eks. 2).
     * @return første gang returnerer den 6, andre gang 4 og ellers 2.
     * */

    public int getResistBonus() {
        if (numberOfTimes == 0) {
            numberOfTimes ++;
            return 6;
        }
        else if (numberOfTimes == 1) {
            numberOfTimes ++;
            return 4;
        }
        else {
            numberOfTimes ++;
            return 2;
        }
    }



}
