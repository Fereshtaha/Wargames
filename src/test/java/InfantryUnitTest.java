import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class InfantryUnitTest {

    @Test
    void test_getAttackBonus() {
        InfantryUnit infantryUnit = new InfantryUnit("Swordman", 20);
        assertEquals(5, infantryUnit.getAttackBonus());
    }
}