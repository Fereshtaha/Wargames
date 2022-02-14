public class InfantryUnit extends Unit {

    public InfantryUnit(String name, int health, int armor, int attack) {
        super(name, health, attack, armor);
    }

    public InfantryUnit(String name, int health) {
        super(name, health);
        this.attack = 15;
        this.armor = 10;
    }

    public int getAttackBonus() {
        this.health = this.health - this.attack;
        return this.health;
    }

    public int getResistBonus() {
        this.health = this.health + this.armor;
        return this.health;
    }

    public static void main(String[] args) {
    }
}
