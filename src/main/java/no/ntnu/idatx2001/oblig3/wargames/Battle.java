package no.ntnu.idatx2001.oblig3.wargames;

/**
 * Battle klassen simulerer slag mellom to armeer.
 */
public class Battle {
    private Army armyOne;
    private Army armyTwo;

    public Battle(Army armyOne,Army armyTwo) {
        this.armyOne = armyOne;
        this.armyTwo = armyTwo;
    }

    /**
     * tom konstruktør for å starte simuleringen uten parametere
     */
    public Battle() {
    }

    /**
     * To armeer med ti av hver unit på begge sider.
     */
    private void fillwithdummies() {
        armyOne = DummyDataInitalizr.makeDefaultArmy("Human army");
        armyTwo = DummyDataInitalizr.makeDefaultArmy("Orchids horde");
    }

    /**
     * Simuleringen av et slag. Forteller underveis om unitene blir fjernet, og hvor mange som er igjen.
     * Returnerer når kampen er over og hvem som vant.
     */
    public void simulate() {
        fillwithdummies();
        //Så lenge kampen ikke er over, så skal det fortsette å ta en random unit fra de ulike armeene , som skal
        //attacke hverandre. Fjerner en unit, hvis den har health lik 0. Printer ut hvor mange units som er igjen.
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
            //Hvis enten armyOne eller armyTwo er tom for units, så er kampen over.
            if (!armyOne.hasUnits() || !armyTwo.hasUnits()) {
                isbattleover = true;
                //System.out.println("Kampen er over");
            }

            }
        // printer ut vinneren
        if (armyOne.hasUnits()) {
            System.out.println("Game over. The winner is " + armyOne.getName());
        }
        if (armyTwo.hasUnits()) {
            System.out.println("Game over. The winner is " + armyTwo.getName());
        }
    }

    //Oppretter en instans av battle, setter opp armeene og starter simuleringen.
    public static void main(String[] args) {
        Battle battle = new Battle();
        battle.fillwithdummies();
        battle.simulate();
    }
}
