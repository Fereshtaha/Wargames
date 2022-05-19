import no.ntnu.idatx2001.oblig3.wargames.RangedUnit;
import no.ntnu.idatx2001.oblig3.wargames.Terrain;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class RangedUnitTest {

    @Test
    void test_getRangedUnit() {
        RangedUnit rangedUnit = new RangedUnit("Swordman", 20);
        RangedUnit rangedUnit1 = new RangedUnit("Swordman", 20, 10, 5, Terrain.FOREST);
        RangedUnit rangedUnit2 = new RangedUnit("Swordman", 20, 10, 5, Terrain.HILL);

        assertEquals("Swordman", rangedUnit.getName());
        assertEquals(20, rangedUnit.getHealth());
        assertEquals(15, rangedUnit.getAttack());
        assertEquals(8, rangedUnit.getArmor());

       // assertEquals(10, rangedUnit1.getArmor());
       // assertEquals(5, rangedUnit1.getAttack());
    }


    @Test
    void test_getAttackBonus() {
        RangedUnit rangedUnit = new RangedUnit("Swordman", 20);
        RangedUnit rangedUnit1 = new RangedUnit("Swordman", 20, 10, 5, Terrain.FOREST);
        RangedUnit rangedUnit2 = new RangedUnit("Swordman", 20, 10, 5, Terrain.HILL);

        assertEquals(3, rangedUnit.getAttackBonus());
        assertEquals(2, rangedUnit1.getAttackBonus());
        assertEquals(4, rangedUnit2.getAttackBonus());
    }

    @Test
    void test_getResistBonus() {
        RangedUnit rangedUnit = new RangedUnit("Swordwoman", 25);

        assertEquals(6,rangedUnit.getResistBonus());
        assertEquals(4,rangedUnit.getResistBonus());
        assertEquals(2,rangedUnit.getResistBonus());



    }
}
