import no.ntnu.idatx2001.oblig3.wargames.InfantryUnit;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class InfantryUnitTest {

    @Test
    void test_getAttackBonus() {
        InfantryUnit infantryUnit = new InfantryUnit("Swordman", 20);
        assertEquals(2, infantryUnit.getAttackBonus());}

    @Test
    void test_getResistBonus() {
        InfantryUnit infantryUnit1 = new InfantryUnit("Swordwoman", 30);
        assertEquals(1, infantryUnit1.getResistBonus());
    }

}