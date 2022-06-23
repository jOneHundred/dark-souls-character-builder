public enum Profession {
    KNIGHT, MERCENARY, WARRIOR, HERALD, THIEF, ASSASSIN, SORCERCER, PYROMANCER, CLERIC, DEPRIVED;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
