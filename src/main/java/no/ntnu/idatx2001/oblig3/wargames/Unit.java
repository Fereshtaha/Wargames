package no.ntnu.idatx2001.oblig3.wargames;

public abstract class Unit {
    // navnet til spilleren
    private String name;
    // verdien reduseres når enheten blir angrepet, og kan aldri være lavere enn 0
    private int health;
    // representerer enhetens våpen
    private int attack;
    // forsvarsverdi som beskytter under et angrep
    private int armor;

    /** *
     lager en instans av units
     * @param name et kort beskrivende navn, f.eks. "Swordman" eller "Archer"
     * @param health en verdi som angir helsa til enheten.
     *               Verdien reduseres når enheten blir angrepet, og kan aldri være lavere enn 0
     * @param attack en angrepsverdi som representerer enhetens våpen
     * @param armor en forsvarsverdi som beskytter under et angrep
     */
    public Unit(String name, int health, int attack, int armor) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.armor = armor;
    }

    /**
     * attacker en opponent
     * @param opponent den andre uniten som blir angrepet
     */
    public void attack(Unit opponent) {
        int healthleft = opponent.getHealth()-(this.getAttackBonus() + this.attack)
                + (opponent.getArmor() + opponent.getResistBonus());
        if (healthleft <= 0) {
            opponent.setHealth(0);
        } else {
            opponent.setHealth(healthleft);
        }
    }

    /**
     * returnerer navn
     */
    public String getName(String name) {
        return name; }

    /**
     * Gir healthen
     * @return int health
     */
    public int getHealth() {
        return this.health;
    }

    /**
     * Gir attacken
     * @return int attack
     */

    public int getAttack() {
        return this.attack;
    }

    /**
     * Gir rustningen
     * @return int armor
     */
    public int getArmor() {
        return this.armor;
    }

    /**
     * Setter hvor mye liv det skal være
     * @param health hvor mye liv det er
     */
    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public String toString() {
        return "Unit{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", attack=" + attack +
                ", armor=" + armor +
                '}';
    }

    // Legges til angrepsverdie nnår man angriper en annen enhet

    /**
     * Gir attack bonusen
     * @return kommer an på hvilken unit det er
     */
    abstract public int getAttackBonus();

    /**
     * Gir poeng hvis man klarer å stå imot angrep
     * @return kommer an på hvilken unit det er
     */
    abstract public int getResistBonus();


    public static void main(String[] args) {


    }


}
