package no.ntnu.idatx2001.oblig3.wargames;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.stream.Collectors;

/**
 *Army klassen lager armeer med uniter
 */

public class Army {

    /**
     * private klassevariabler
     */
    private final String name;
    private List<Unit> units = new ArrayList<>();

    /**
     * enkel konstruktør
     * @param name navnet til armeen
     */
    public Army(String name) {
        this.name = name;
    }

    /**
     *
     * @param name navnet til armeen
     * @param units hvilken unit det er. Kan være Infantry, ranged, commander osv.
     */
    public Army(String name, List<Unit> units) {
        this.name = name;
        this.units = units;
    }

    /**
     *
     * @return returnerer navnet
     */

    public String getName() {
        return this.name;
    }

    /**
     * Legger til en unit i units klassen
     * @param unit unit er en av personene som skal være med å kjempe i armeen.
     * @return returnerer listen
     */
    public boolean add(Unit unit) {
        return units.add(unit);
    }

    /**
     * Legger til alle unitsene i en liste kalt units.
     * @param units liste over hvor mange som er med i armeen.
     * @return antallet uniter i armeen.
     */

    public boolean addAll(List<Unit> units) {
        return units.addAll(units);
    }

    /**
     * Fjerner en unit fra armeen
     * @param unit er en av de som skal være med å kjempe i armeen.
     * @return returnerer en mindre unit
     */
    public boolean remove(Unit unit) {
        return units.remove(unit);
    }

    /**
     * Sjekker om armeen har units.
     * @return false hvis det er units og true hvis den er tom
     */

    public boolean hasUnits() {
        return !units.isEmpty();
    }

    /**
     * Får alle unitene
     * @return returnerer alle unitene
     */
    public List<Unit> getAllUnits() {
        return units;
    }

    /**
     * Får en random unit
     * @return returnerer en random unit
     */

    public Unit getRandom() {
        Random rand = new Random();
        return units.get(rand.nextInt(this.units.size()));
    }

    /**
     * Streng med navn og units
     * @return returnerer navnet og unitene
     */
    @Override
    public String toString() {
        return "Army{" +
                "name='" + name + '\'' +
                ", units=" + units +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Army army = (Army) o;
        return Objects.equals(name, army.name) && Objects.equals(units, army.units);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, units);
    }

    /**
     * @return instansene i units som er av typen Infantry units.
     */
    public List<Unit> getInfantryUnits() {
        return this.units.stream().filter(infantryUnit ->
                infantryUnit.getAttack() == 15 && infantryUnit.getArmor() == 10).collect(Collectors.toList());
    }

    /**
     * @return instansene i units som er av typen Cavalry units.
     */

    public List<Unit> getCavalryUnits() {
        return this.units.stream().filter(cavalryUnit ->
                cavalryUnit.getAttack() == 20 && cavalryUnit.getArmor() == 12).collect(Collectors.toList());
    }

    /**
     * @return instansene i units som er av typen Ranged units.
     */
    public List<Unit> getRangedUnits() {
        return this.units.stream().filter(rangedUnit ->
                rangedUnit.getArmor() == 12 && rangedUnit.getAttack() == 20).collect(Collectors.toList());
    }

    /**
     * @return instansene i units som er av typen Commander units.
     */

    public List<Unit> getCommanderUnits() {
        return this.units.stream().filter(commanderUnits ->
                commanderUnits.getAttack() == 25 && commanderUnits.getArmor() == 15).collect(Collectors.toList());
    }



}