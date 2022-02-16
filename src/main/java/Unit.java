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

     * @param name
     * @param health
     * @param attack
     * @param armor
     */
    public Unit(String name, int health, int attack, int armor) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.armor = armor;
    }

    public void attack(Unit opponent) {
        int healthleft = opponent.getHealth()-(this.getAttackBonus() + this.attack)
                + (opponent.getArmor() + opponent.getResistBonus());
        if (healthleft <= 0) {
            opponent.setHealth(0);
        } else {
            opponent.setHealth(healthleft);
        }
    }

    //returnerer navn
    public String getName(String name) {
        return name; }

    public int getHealth() {
        return this.health;
    }

    public int getAttack() {
        return this.attack;
    }

    public int getArmor() {
        return this.armor;
    }

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
     *
     * @return
     */
    abstract public int getAttackBonus();

    //Legges til forsvarsverdien til enheten som blir angrepet
    abstract public int getResistBonus();


    public static void main(String[] args) {


    }


}
