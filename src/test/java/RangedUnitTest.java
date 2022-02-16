import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class RangedUnitTest {
    @Test
    void test_getAttackBonus() {
        RangedUnit rangedUnit = new RangedUnit("Swordman", 20);
        assertEquals(3, rangedUnit.getAttackBonus());
    }

    @Test
    void test_getResistBonus() {
        RangedUnit rangedUnit = new RangedUnit("Swordwoman", 25);
        assertEquals(6,rangedUnit.getResistBonus());
        assertEquals(4,rangedUnit.getResistBonus());
        assertEquals(2,rangedUnit.getResistBonus());



    }
}
