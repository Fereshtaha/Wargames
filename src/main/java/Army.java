import java.util.ArrayList;
import java.util.List;

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

//public boolean addAll(List<Unit> units) {
//    return ;
//}

}