public class Teren extends Proprietate {
    private int rang;


    public Teren(String strada, int numar, int suprafata, int alegereRang) {
        super(strada, numar, suprafata);
        this.rang = alegereRang;
    }

    @Override
    public String toString() {
        return " ".repeat(4) + "Teren: " + " ".repeat(2) + super.toString() + ", Rang: " + rang + "\n" +
                " ".repeat(15) + "Cost: " + impozit();
    }

    public int impozit() {
        return getSuprafata() * 350;
    }


}
