import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CavalryUnitTest {
    @Test
    void test_getAttackBonus() {
        CavalryUnit cavalryUnit = new CavalryUnit("Swordman", 40);
        assertEquals(6, cavalryUnit.getAttackBonus());
        assertEquals(2, cavalryUnit.getAttackBonus());
        assertEquals(2, cavalryUnit.getAttackBonus());

    }

    @Test
    void test_getResistanceBonus() {
        CavalryUnit cavalryUnit = new CavalryUnit("Swordman", 20);
        assertEquals(1, cavalryUnit.getResistBonus());

    }


}
