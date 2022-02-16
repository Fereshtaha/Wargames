
public class RangedUnit extends Unit{
    private int numberOfTimes = 0;

    public RangedUnit(String name, int health, int armor, int attack) {
        super(name, health, armor, attack);
    }


    // forenklet konstruktør
    public RangedUnit(String name, int health) {
        super(name, health, 15, 8);
    }

    // fordel fordi den kan angripe fra en avstand
    public int getAttackBonus() {
        return 3;
    }


    // basert på avstanden på fienden. Returnerer en betydelig verdi første gangen enheten blir angrepet (f.eks. 6) . Verdien blir
    // redusert neste gang den blir angrepet (til f.eks. 4). Fra og med det tredje angrepet skal det returneres en standard
    // verdi (f.eks. 2).
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

    public static void main(String[] args) {
        RangedUnit rangedUnit = new RangedUnit("Swordman", 20);
        System.out.println(rangedUnit.getAttack());
    }

}
