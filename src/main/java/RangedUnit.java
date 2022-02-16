import org.w3c.dom.ranges.Range;

public class RangedUnit extends Unit{

    public RangedUnit(String name, int health, int armor, int attack) {
        super(name, health, armor, attack);
    }


    // forenklet konstruktør
    public RangedUnit(String name, int health) {
        super(name, health);
        this.attack = 15;
        this.armor = 8;
    }

    // fordel fordi den kan angripe fra en avstand
    public int getAttackBonus() {
        this.health = this.attack - 3;
        return this.health;
    }


    // basert på avstanden på fienden. Returnerer en betydelig verdi første gangen enheten blir angrepet (f.eks. 6) . Verdien blir
    // redusert neste gang den blir angrepet (til f.eks. 4). Fra og med det tredje angrepet skal det returneres en standard
    // verdi (f.eks. 2).
    public int getResistBonus() {
        if (this.getAttack() == 15) {
            this.health = this.health + this.armor + 6;
            return this.health;}
        else if (this.getAttack() == 14) {
            this.health = this.health + this.armor + 4;
            return this.health;}
        else {
            this.health = this.health + this.armor + 2;
            return this.health;}
    }

    public static void main(String[] args) {
        RangedUnit rangedUnit = new RangedUnit("Swordman", 20);
        System.out.println(rangedUnit.getAttack());
    }

}
