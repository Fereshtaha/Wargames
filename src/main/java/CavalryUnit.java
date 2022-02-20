/**
 * Cavarly unit klassen returnerer attackbonusen 6 den første gangen og 2 alle andre ganger.
 * Resistbonusen returnerer 1.
 */

public class CavalryUnit extends Unit {
    private int numberOfTimes = 0;

    public CavalryUnit(String name, int health, int attack, int armor) {
        super(name, health, attack, armor);
    }

    // den forenklede
    public CavalryUnit(String name, int health) {
        super(name, health, 20, 12);
    }

    // Enheten har en styrke første gang den angriper og i nærkamp. Returnerer en verdi som representerer disse fordelene
    // (f.eks. 4+2 ved første angrep, deretter 2)
    public int getAttackBonus() {
        if (numberOfTimes == 0) {
            numberOfTimes ++;
            return 4+2;
        }
        else {
            numberOfTimes ++;
            return 2;
        }
    }
    // Enheten har en liten fordel når den blir angrepet i nærkamp. Metoden getResistBonus skal returnere en verdi som representerer
    // denne fordelen. F.eks. 1.
    public int getResistBonus() {
        return 1;
    }
}
