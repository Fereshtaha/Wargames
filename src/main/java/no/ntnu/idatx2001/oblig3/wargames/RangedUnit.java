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

    public RangedUnit(String name, int health, int armor, int attack) {
        super(name, health, armor, attack);
    }


    /** forenklet konstruktør med attack satt lik 15 og armor lik 8.
     *
     */
    public RangedUnit(String name, int health) {
        super(name, health, 15, 8);
    }

    /** fordel fordi den kan angripe fra en avstand
     * Returnerer attack bonusen.
     * @return int 3
     */
    public int getAttackBonus() {
        return 3;
    }


    /** Basert på avstanden på fienden. Returnerer en betydelig verdi første gangen enheten blir angrepet (f.eks. 6) .
     * Verdien blir redusert neste gang den blir angrepet (til f.eks. 4).
     * Fra og med det tredje angrepet skal det returneres en standard
     verdi (f.eks. 2). */
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
