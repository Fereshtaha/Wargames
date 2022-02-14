import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Army {
    String name;
    List<Unit> units = new ArrayList<Unit>();

    public Army(String name) {
        this.name = name;
    }

    public Army(String name, List<Unit> units) {
        this.name = name;
        this.units = units;
    }

    public String getName() {
        return this.name;
    }

    //se på denne
    public boolean add(Unit unit) {
        return units.add(unit);
    }

    public boolean addAll(List<Unit> units) {
        return units.addAll(units);
    }

    public boolean remove(Unit unit) {
        return units.remove(unit);
    }

    public boolean hasUnits() {
        return !units.isEmpty();
    }

    public List<Unit> getAllUnits() {
        return units;
    }

    public Unit getRandom() {
        Random rand = new Random();
        return units.get(rand.nextInt());
    }

    public String toString() {
        return units.toString();
    }

    public boolean equals(Object object) {
        return object.equals(units);
    }

    public int hashCode() {
        return units.hashCode();
    }

    public static void main(String[] args) {
        Army army = new Army("Petter kanin");
        RangedUnit rangedUnit = new RangedUnit("Wow", 10);
        System.out.println(army.hasUnits());

    }
}