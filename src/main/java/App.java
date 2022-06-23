import lombok.extern.slf4j.Slf4j;

@Slf4j
public class App {
    public static void main(String[] args) {
        Character knight = new Character.Builder("Alein")
                .profession(Profession.KNIGHT)
                .weapon(Weapon.SWORD)
                .armor(Armor.HEAVY)
                .gender(Gender.MALE)
                .body(Body.MUSCULAR)
                .build();
        log.info(knight.toString());
    }
}
