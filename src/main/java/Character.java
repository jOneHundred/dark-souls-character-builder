public class Character {

    private final String name;
    private final Profession profession;
    private final Weapon weapon;
    private final Armor armor;
    private final int age;
    private final Gender gender;
    private final Body body;

    public String getName() {
        return name;
    }

    public Profession getProfession() {
        return profession;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public Body getBody() {
        return body;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" +
                "Profession: " + ((profession != null) ? profession : "undefined") + "\n" +
                "Weapon: " + ((weapon != null) ? weapon : "undefined") + "\n" +
                "Armor: " + ((armor != null) ? armor : "undefined") + "\n" +
                "Age: " + ((age != 0) ? age : "undefined") + "\n" +
                "Gender: " + ((gender != null) ? gender : "undefined") + "\n" +
                "Body: " + ((body != null) ? body : "undefined") + "\n";
    }

    private Character(Builder builder){
        this.name = builder.name;
        this.profession = builder.profession;
        this.weapon = builder.weapon;
        this.armor = builder.armor;
        this.age = builder.age;
        this.gender = builder.gender;
        this.body = builder.body;
    }
    public static class Builder{
        private final String name;
        private Profession profession;
        private Weapon weapon;
        private Armor armor;
        private int age;
        private Gender gender;
        private Body body;

        public Builder(String name){
            if(name==null){
                throw new IllegalArgumentException("Empty name");
            }
            this.name = name;
        }

        public Builder profession(Profession profession){
            this.profession = profession;
            return this;
        }

        public Builder weapon(Weapon weapon){
            this.weapon = weapon;
            return this;
        }

        public Builder armor(Armor armor){
            this.armor = armor;
            return this;
        }

        public Builder age(int age){
            this.age = age;
            return this;
        }

        public Builder gender(Gender gender){
            this.gender = gender;
            return this;
        }

        public Builder body(Body body){
            this.body = body;
            return this;
        }

        public Character build(){
            return new Character(this);
        }
    }

}
