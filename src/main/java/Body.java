public enum Body {
    SKINNY, MUSCULAR, FAT;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
