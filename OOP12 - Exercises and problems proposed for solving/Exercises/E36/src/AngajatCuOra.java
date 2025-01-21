import java.util.ArrayList;
import java.util.Vector;

public class AngajatCuOra extends Angajat {
    private double salariuPeOra;
    private double[] oreLucrate;

    public AngajatCuOra(String nume, double salariuPeOra) {
        super(nume);
        this.salariuPeOra = salariuPeOra;
        this.oreLucrate = new double[31];
    }

    public void setSalariuPeOra(double salariuPeOra) {
        this.salariuPeOra = salariuPeOra;
    }

    public void adaugaOre(double nrOre) {
        for (int i = 0; i < oreLucrate.length; i++) {
            if (oreLucrate[i] == 0) {
                oreLucrate[i] = nrOre;
                break;
            }
        }
    }

    @Override
    public double calculSalar() {
        double totalOre = 0;
        for (var ore : oreLucrate) {
            totalOre += ore;
        }
        return salariuPeOra * totalOre;
    }
}
