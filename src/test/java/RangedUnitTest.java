import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class RangedUnitTest {
    @Test
    void test_getAttackBonus() {
        RangedUnit rangedUnit = new RangedUnit("Swordman", 20);
        assertEquals(12, rangedUnit.getAttackBonus());
    }

    @Test
    void test_getResistBonus() {
        RangedUnit rangedUnit = new RangedUnit("Swordman", 20);
        assertEquals(34,rangedUnit.getResistBonus());

    }
}
