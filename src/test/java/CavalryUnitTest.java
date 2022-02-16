import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CavalryUnitTest {
    @Test
    void test_getAttackBonus() {
        CavalryUnit cavalryUnit = new CavalryUnit("Swordman", 40);
        assertEquals(14, cavalryUnit.getAttackBonus());
        CavalryUnit cavalryUnit1 = new CavalryUnit("Swordman", 30);
        assertEquals(4, cavalryUnit1.getAttackBonus());
        CavalryUnit cavalryUnit3 = new CavalryUnit("Swordman", 40, 4, 5);
        assertEquals(34, cavalryUnit3.getAttackBonus());


    }

    @Test
    void test_getResistanceBonus() {
        CavalryUnit cavalryUnit = new CavalryUnit("Swordman", 20);
        assertEquals(9, cavalryUnit.getResistBonus());

    }


}
