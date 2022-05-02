package no.ntnu.idatx2001.oblig3.wargames;

import java.util.ArrayList;
import java.util.List;

public class UnitFactory {
    private Object Unit;

    /**
     * Denne metoden oppretter en Unit basert på type enhet, navn og helseverdi
     */
    public Unit createUnit(StateOfUnit stateOfUnit, String name,  int health) {
        return switch (stateOfUnit) {
            case CAVALRYUNIT -> new CavalryUnit(name, health);
            case COMMANDERUNIT -> new CommanderUnit(name, health);
            case INFANTRYUNIT -> new InfantryUnit(name, health);
            case RANGEDUNIT -> new RangedUnit(name, health);
        };
    }

    /**
     * Denne metoden returnerer en liste med n antall Units basert på type enhet, navn og helseverdi.
     * Metoden brukes når vi trenger mange enheter av samme type
     */

    public List<Unit> createListOfUnits(int n, StateOfUnit stateOfUnit, String name, int health) {
        ArrayList<Unit> unitList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            unitList.add(createUnit(stateOfUnit, name, health));
        }
        return unitList;
    }
}

