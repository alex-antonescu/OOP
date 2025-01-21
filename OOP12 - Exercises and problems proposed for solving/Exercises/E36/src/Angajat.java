public abstract class Angajat {
    protected String nume;

    public Angajat(String nume) {
        this.nume = nume;
    }
    public abstract double calculSalar();

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Angajat angajat)) return false;

        return nume.equals(angajat.nume);
    }

    @Override
    public int hashCode() {
        return nume.hashCode();
    }
}
