public enum Armor {
    LIGHT, MEDIUM, HEAVY;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
