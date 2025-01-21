public abstract class Proprietate {
    private String strada;
    private int numar;
    private int suprafata;

    public Proprietate(String strada, int numar, int suprafata) {
        this.strada = strada;
        this.numar = numar;
        this.suprafata = suprafata;

    }

    public int getSuprafata() {
        return suprafata;
    }

    @Override
    public String toString() {
        return  "Strada " + strada + " Nr. " + numar + "\n" +
                 " ".repeat(15)+ "Suprafata: " + suprafata;
    }

    public abstract int impozit();
}
