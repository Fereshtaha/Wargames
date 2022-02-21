/**
 * Commander unit arver alle egenskapene sine fra Cavalry Unit.
 */

public class CommanderUnit extends CavalryUnit {

    public CommanderUnit(String name, int health, int armor, int attack) {
        super(name,health,attack,armor);
    }

    public CommanderUnit(String name, int health) {
        super(name, health, 25, 15);
    }

}
