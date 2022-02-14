public abstract class Unit {
    // navnet til spilleren
    String name;
    // verdien reduseres når enheten blir angrepet, og kan aldri være lavere enn 0
    int health;
    // representerer enhetens våpen
    int attack;
    // forsvarsverdi som beskytter under et angrep
    int armor;

    public Unit(String name, int health, int attack, int armor) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.armor = armor;
    }


    public Unit(String name, int health) {
        this.name = name;
        this.health = health;
    }


    public void attack(Unit opponent) {
        opponent.setHealth(Math.max(opponent.getHealth(),
                opponent.getHealth()-(this.getAttackBonus() - this.attack)
                        + (opponent.armor + opponent.getResistBonus())
        ));
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

    public String toString(String name) {
        return name.toString();
    }

    // Legges til angrepsverdie nnår man angriper en annen enhet
    abstract public int getAttackBonus();

    //Legges til forsvarsverdien til enheten som blir angrepet
    abstract public int getResistBonus();


    public static void main(String[] args) {

    }


}
