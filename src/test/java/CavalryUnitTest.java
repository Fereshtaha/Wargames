import no.ntnu.idatx2001.oblig3.wargames.CavalryUnit;
import org.junit.jupiter.api.Test;

import static java.lang.constant.ConstantDescs.NULL;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 * Tester Cavalry Unit klassen
 */


class CavalryUnitTest {

    @Test
    void test_CavalryUnit() {
        CavalryUnit cavalryUnit = new CavalryUnit("Swordman",  5);
        CavalryUnit cavalryUnit2 = new CavalryUnit("Swordman", 40, 50, 10);
        CavalryUnit cavalryUnit1 = new CavalryUnit("Swordman", 40);

        assertEquals(20, cavalryUnit.getAttack());
        assertEquals(5, cavalryUnit.getHealth());
        assertEquals(12, cavalryUnit.getArmor());

        assertEquals(40, cavalryUnit2.getHealth());
        assertEquals(50, cavalryUnit2.getAttack());
        assertEquals(10, cavalryUnit2.getArmor());

        assertNotEquals("", cavalryUnit.getName(), "Empty name");
        assertNotEquals(NULL, cavalryUnit.getName(), "Empty name");

        assertNotEquals(NULL, cavalryUnit1.getName());

    }

    @Test
    void test_getAttackBonus() {

        CavalryUnit cavalryUnit = new CavalryUnit("Testing name",  5);


        //positive tester
        assertEquals(6, cavalryUnit.getAttackBonus());
        assertEquals(2, cavalryUnit.getAttackBonus());
        assertEquals(2, cavalryUnit.getAttackBonus());


        // negative tester
        assertNotEquals(4, cavalryUnit.getAttackBonus());
        assertNotEquals(8, cavalryUnit.getAttackBonus());
        assertNotEquals(10, cavalryUnit.getAttackBonus());


    }

    @Test
    void test_getResistanceBonus() {
        CavalryUnit cavalryUnit = new CavalryUnit("Swordman", 20);
        assertEquals(1, cavalryUnit.getResistBonus());

        assertNotEquals(0, cavalryUnit.getResistBonus());

    }


}
