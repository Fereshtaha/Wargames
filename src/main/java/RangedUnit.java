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
        return 3;
    }

    // basert på avstanden på fienden. Returnerer en betydelig verdi første gangen enheten blir angrepet (f.eks. 6) . Verdien blir
    // redusert neste gang den blir angrepet (til f.eks. 4). Fra og med det tredje angrepet skal det returneres en standard
    // verdi (f.eks. 2).
    public int getResistBonus() {
        if (this.getAttack() == 1) {
            return 6;}
        else if (this.getAttack() == 2) {
            return 4;}
        else {
            return 2;
        }
    }

    public static void main(String[] args) {

    }
}
