import no.ntnu.idatx2001.oblig3.wargames.CommanderUnit;
import no.ntnu.idatx2001.oblig3.wargames.Terrain;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CommanderUnitTest {
    @Test
    void test_CommanderUnit() {
        CommanderUnit commanderUnit1 = new CommanderUnit("Swordman", 10, 15, 5, Terrain.FOREST);

        assertEquals(15, commanderUnit1.getHealth());
        assertEquals(5, commanderUnit1.getHealth());

    }

}
