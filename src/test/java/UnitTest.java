import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import no.ntnu.idatx2001.oblig3.wargames.*;
import org.junit.jupiter.api.Test;

public class UnitTest {

    @Test
    void test_Unit() {
        CavalryUnit cavalryUnit = new CavalryUnit("", 10);
        CommanderUnit commanderUnit = new CommanderUnit("Sworman", 10);
        InfantryUnit infantryUnit = new InfantryUnit("Swordman", 10);
        RangedUnit rangedUnit = new RangedUnit("Swordman", 10);

        assertEquals("Swordman","");




    }
}
