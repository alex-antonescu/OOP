public class Cladire extends Proprietate {


    public Cladire(String strada, int numar, int suprafata) {
        super(strada, numar, suprafata);

    }

    @Override
    public String toString() {
        return " ".repeat(4) + "Cladire: " + super.toString() + "\n" +
                " ".repeat(15)+"Cost: " + impozit();
    }

    public int impozit() {
        return getSuprafata() * 500;
    }
}
