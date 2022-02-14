public class CavalryUnit extends Unit {

    public CavalryUnit(String name, int health, int attack, int armor) {
        super(name, health, attack, armor);
    }

    // den forenklede
    public CavalryUnit(String name, int health) {
        super(name, health);
        this.attack = 20;
        this.armor = 12;

    }

    // Enheten har en styrke første gang den angriper og i nærkamp. Returnerer en verdi som representerer disse fordelene
    // (f.eks. 4+2 ved første angrep, deretter 2)
    public int getAttackBonus() {
        if (this.getAttack() == 1) {
            return this.attack - 6;
        } else {
            return this.attack - 2;
        }
    }
    // Enheten har en liten fordel når den blir angrepet i nærkamp. Metoden getResistBonus skal returnere en verdi som representerer
    // denne fordelen. F.eks. 1.
    public int getResistBonus() {
        return this.armor + 1;
    }

}
