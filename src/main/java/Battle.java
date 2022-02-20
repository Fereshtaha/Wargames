/**
 * Battle klassen simulerer slag mellom to armeer.
 */
public class Battle {
    Army armyOne;
    Army armyTwo;

    public Battle(Army armyOne,Army armyTwo) {
        this.armyOne = armyOne;
        this.armyTwo = armyTwo;
    }

    public Battle() {

    }

    /**
     * To armeer med ti av hver unit på begge sider.
     */
    private void fillwithdummies() {
        Army humanArmy = new Army("Human army");
        armyOne = humanArmy;
        Army orchishHorde = new Army("Orcish horde");
        armyTwo = orchishHorde;

        for (int i = 1; i<=10; i++) {
            humanArmy.add(new InfantryUnit("Swordman",100));
            humanArmy.add(new CavalryUnit("Swordman",100));
            humanArmy.add(new RangedUnit("Swordman",100));
            humanArmy.add(new CommanderUnit("Swordman",180));
            orchishHorde.add(new InfantryUnit("Paperman", 100));
            orchishHorde.add(new CavalryUnit("Paperman", 100));
            orchishHorde.add(new RangedUnit("Paperman", 100));
            orchishHorde.add(new CommanderUnit("Paperman", 180));

        }
    }

    /**
     * To armeer med to unit for å se om simuleringen starter.
     */

    private void fillwithtoes() {
        Army humanArmy = new Army("Human army");
        armyOne = humanArmy;
        Army orchishHorde = new Army("Orcish horde");
        armyTwo = orchishHorde;

        humanArmy.add(new InfantryUnit("Swordman",100, 10, 50));
        humanArmy.add(new InfantryUnit("Swordman",100, 10, 50));
        orchishHorde.add(new InfantryUnit("Paperman", 100, 10, 50));
        orchishHorde.add(new InfantryUnit("Paperman", 100, 10, 50));

    }

    /**
     * simuleringen av et slag. Forteller underveis om unitene blir fjernet, og hvor mange som er igjen.
     * Returnerer når kampen er over og hvem som vant.
     */

    public void simulate() {
        fillwithdummies();
        //fillwithtoes();
        boolean isbattleover = false;
        while (!isbattleover) {
            Unit unit = armyOne.getRandom();
            Unit opponent = armyTwo.getRandom();
            unit.attack(opponent);
            opponent.attack(unit);
            if (unit.getHealth() == 0) {
                armyOne.remove(armyOne.getRandom());
                System.out.println("Removing an unit from army one. The number of units left in army one are: "
                        + armyOne.getAllUnits().size());
                //System.out.println("Fjerner en unit fra army one");
                //System.out.println(armyOne.getAllUnits().size());
            }
            if (opponent.getHealth() == 0) {
                armyTwo.remove(armyTwo.getRandom());
                System.out.println("Removing an unit from army one. The number of units left in army two are: " +
                        armyTwo.getAllUnits().size());
                //System.out.println("Fjerner en unit fra army to");
                //System.out.println(armyTwo.getAllUnits().size());
            }

            if (!armyOne.hasUnits() || !armyTwo.hasUnits()) {
                isbattleover = true;
                //System.out.println("Kampen er over");
            }

            }
        if (armyOne.hasUnits()) {
            System.out.println("Game over. The winner is "+armyOne.getName());
        }
        if (armyTwo.hasUnits()) {
            System.out.println("Game over. The winner is "+armyTwo.getName());
        }
    }

    public static void main(String[] args) {
        Battle battle = new Battle();
        battle.fillwithdummies();
        battle.simulate();
    }
}
