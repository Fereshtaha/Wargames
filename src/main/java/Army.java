import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

/**
 *
 */
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


    @Override
    public String toString() {
        return "Army{" +
                "name='" + name + '\'' +
                ", units=" + units +
                '}';
    }

    public static void main(String[] args) {

    }
}