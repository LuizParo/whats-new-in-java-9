class Person implements Serializable {
    String name;
    int years;

    public Person(String name, int years) {
        this.name = name;
        this.years = years;
    }

    @Override 
    public String toString() {
        return String.format("Name: %s, Years: %d", name, years);
    }
}
