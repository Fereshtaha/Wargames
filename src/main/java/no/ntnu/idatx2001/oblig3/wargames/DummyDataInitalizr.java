package no.ntnu.idatx2001.oblig3.wargames;

public class DummyDataInitalizr {
    public static Army makeDefaultArmy(String armyName) {
        Army army = new Army(armyName);
        for (int i = 1; i<=10; i++) {
            army.add(new InfantryUnit("Legionnare",100));
            army.add(new CavalryUnit("Swordman",100));
            army.add(new RangedUnit("Serviceman",100));
            army.add(new CommanderUnit("Archer",180));
        }
        return army;
    }
}
