import no.ntnu.idatx2001.oblig3.wargames.InfantryUnit;
import no.ntnu.idatx2001.oblig3.wargames.Terrain;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class InfantryUnitTest {

    @Test
    void test_getInfantryUnit() {
        InfantryUnit infantryUnit = new InfantryUnit("Swordman", 15);
        InfantryUnit infantryUnit1 = new InfantryUnit("Swordman", 15, 5, 3, Terrain.FOREST);

        assertEquals("Swordman", infantryUnit.getName());
        assertEquals(15, infantryUnit.getHealth());
        assertEquals(15, infantryUnit.getAttack());
        assertEquals(10, infantryUnit.getArmor());

        assertEquals(5, infantryUnit1.getArmor());
        assertEquals(10, infantryUnit.getArmor());
    }

    @Test
    void test_getAttackBonus() {
        InfantryUnit infantryUnit = new InfantryUnit("Swordman", 20);
        InfantryUnit infantryUnit1 = new InfantryUnit("Swordman", 15, 5, 3, Terrain.FOREST);

        assertEquals(2, infantryUnit.getAttackBonus());
        assertEquals(4, infantryUnit1.getAttackBonus());

    }


    @Test
    void test_getResistBonus() {
        InfantryUnit infantryUnit = new InfantryUnit("Swordwoman", 30);
        InfantryUnit infantryUnit1 = new InfantryUnit("Swordman", 15, 5, 3, Terrain.FOREST);

        assertEquals(1, infantryUnit.getResistBonus());

        assertEquals(2, infantryUnit1.getResistBonus());
    }

}