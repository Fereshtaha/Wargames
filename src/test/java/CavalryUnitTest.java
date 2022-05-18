import no.ntnu.idatx2001.oblig3.wargames.CavalryUnit;
import no.ntnu.idatx2001.oblig3.wargames.Terrain;
import org.apache.commons.lang3.ObjectUtils;
import org.junit.jupiter.api.Test;

import static java.lang.constant.ConstantDescs.FALSE;
import static java.lang.constant.ConstantDescs.NULL;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tester Cavalry Unit klassen
 */


class CavalryUnitTest {

    @Test
    void test_CavalryUnit() {
        CavalryUnit cavalryUnit = new CavalryUnit("Swordman",  5);
        CavalryUnit cavalryUnit2 = new CavalryUnit("Swordman", 40, 50, 10, Terrain.PLAINS);
        CavalryUnit cavalryUnit1 = new CavalryUnit(null, -100);

        assertEquals(20, cavalryUnit.getAttack());
        assertEquals(5, cavalryUnit.getHealth());
        assertEquals(12, cavalryUnit.getArmor());

        assertEquals(40, cavalryUnit2.getHealth());
        assertEquals(50, cavalryUnit2.getAttack());
        assertEquals(10, cavalryUnit2.getArmor());

        assertNotEquals("", cavalryUnit.getName(), "Empty name");
        assertNotEquals(NULL, cavalryUnit.getName(), "Empty name");

        assertFalse(cavalryUnit1.getHealth() > 0);
        assertNotEquals(0, cavalryUnit1.getHealth(), "Health must be over 0");

        assertNotEquals(NULL, cavalryUnit1.getName());

    }

    @Test
    void test_getAttackBonus() {

        CavalryUnit cavalryUnit = new CavalryUnit("Testing name",  5);
        CavalryUnit cavalryUnit2 = new CavalryUnit("Swordman", 40, 50, 10, Terrain.PLAINS);

        // positive tester
        assertEquals(6, cavalryUnit.getAttackBonus());
        assertEquals(2, cavalryUnit.getAttackBonus());
        assertEquals(2, cavalryUnit.getAttackBonus());

        assertEquals(8, cavalryUnit2.getAttackBonus());
        assertEquals(4, cavalryUnit2.getAttackBonus());
        assertEquals(4, cavalryUnit2.getAttackBonus());


        // negative tester
        assertNotEquals(8, cavalryUnit.getAttackBonus());
        assertNotEquals(4, cavalryUnit.getAttackBonus());
        assertNotEquals(3, cavalryUnit.getAttackBonus());

        assertNotEquals(6, cavalryUnit2.getAttackBonus());
        assertNotEquals(2, cavalryUnit2.getAttackBonus());
        assertNotEquals(1, cavalryUnit2.getAttackBonus());


    }

    @Test
    void test_getResistanceBonus() {
        CavalryUnit cavalryUnit = new CavalryUnit("Swordman", 20);
        CavalryUnit cavalryUnit2 = new CavalryUnit("Swordman", 40, 50, 10, Terrain.PLAINS);

        assertEquals(1, cavalryUnit.getResistBonus());
        // assertEquals(2, cavalryUnit2.getResistBonus());

        assertNotEquals(0, cavalryUnit.getResistBonus());
        assertNotEquals(1, cavalryUnit2.getResistBonus());

    }


}
