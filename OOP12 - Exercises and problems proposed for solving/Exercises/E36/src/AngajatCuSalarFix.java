public class AngajatCuSalarFix extends Angajat{
    private double salariuFix;

    public AngajatCuSalarFix(String nume, double salariuFix) {
        super(nume);
        this.salariuFix = salariuFix;
    }

    @Override
    public double calculSalar() {
        return salariuFix;
    }

    public void setSalariuFix(double salariuFix) {
        this.salariuFix = salariuFix;
    }
}
