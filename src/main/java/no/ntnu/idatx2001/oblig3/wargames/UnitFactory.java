package no.ntnu.idatx2001.oblig3.wargames;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO: skriv dokumentasjon her
 */

public class UnitFactory {

    /**
     * Denne metoden oppretter en Unit basert på type enhet, navn og helseverdi
     * @param stateOfUnit hvilken unit det er
     * @param name navnet til uniten
     * @param health helsen til uniten
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
     * @param n antall units vi vil legge til
     * @param stateOfUnit hvilken unit det er
     * @param name navnet på uniten
     * @param health helsen til uniten
     */

    public List<Unit> createListOfUnits(int n, StateOfUnit stateOfUnit, String name, int health) {
        ArrayList<Unit> unitList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            unitList.add(createUnit(stateOfUnit, name, health));
        }
        return unitList;
    }
}

