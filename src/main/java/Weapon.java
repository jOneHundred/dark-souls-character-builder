public enum Weapon {
    DAGGER, SWORD, KATANA, AXE, HAMMER, CLAW, SPEAR, HALBERD, BOW, STAVE, FLAME, TALISMAN;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
