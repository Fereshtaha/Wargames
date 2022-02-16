import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class InfantryUnitTest {

    @Test
    void test_getAttackBonus() {
        InfantryUnit infantryUnit = new InfantryUnit("Swordman", 20);
        assertEquals(5, infantryUnit.getAttackBonus());}

    @Test
    void test_getResistBonus() {
        InfantryUnit infantryUnit1 = new InfantryUnit("Swordwoman", 30);
        assertEquals(40, infantryUnit1.getResistBonus());
    }

}