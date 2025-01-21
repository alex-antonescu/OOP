import java.util.Objects;

public class Produs{
    private String nume;
    private double pret;
    private int cantitate;
    private boolean isCompensat;
    private double coef1 = 1;

    public Produs(){};

    public Produs(String nume, double pret, int cantitate, boolean isCompensat, double coef) {
        this.nume = nume;
        this.pret = pret;
        this.cantitate = cantitate;
        this.isCompensat = isCompensat;
        this.coef1 = isCompensat ? coef : coef1;
    }

    public int getCantitate() {
        return cantitate;
    }

    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }

    public double calculeazaPret() {
        double pretFinal = coef1 * pret;
        System.out.println(pretFinal);
        return pretFinal;
    }

    @Override
    public String toString() {
        return "Produs: " + nume + ", pret: " + pret + ", cantitate: " + cantitate + ", compensat?: " + isCompensat;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produs produs)) return false;

        return Objects.equals(nume, produs.nume);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nume);
    }
}
