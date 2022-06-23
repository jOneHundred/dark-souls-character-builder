public enum Gender {
    MALE, FEMALE, OTHER;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
