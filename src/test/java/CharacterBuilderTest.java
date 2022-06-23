import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CharacterBuilderTest {
    @Test
    void testEmptyName(){
        assertThrows(IllegalArgumentException.class, () -> new Character.Builder(null).build());
    }

    @Test
    void testBuildPyromancer(){
        var pyromancer = new Character.Builder("Gawayne")
                .profession(Profession.PYROMANCER)
                .weapon(Weapon.FLAME)
                .armor(Armor.LIGHT)
                .gender(Gender.OTHER)
                .body(Body.SKINNY)
                .build();
        assertNotNull(pyromancer);
        assertNotNull(pyromancer.toString());
        assertEquals(pyromancer.getProfession(), Profession.PYROMANCER);
        assertEquals(pyromancer.getWeapon(), Weapon.FLAME);
        assertEquals(pyromancer.getArmor(), Armor.LIGHT);
        assertEquals(pyromancer.getGender(), Gender.OTHER);
        assertEquals(pyromancer.getBody(), Body.SKINNY);
        assertEquals(pyromancer.getAge(), 0);
    }
}
