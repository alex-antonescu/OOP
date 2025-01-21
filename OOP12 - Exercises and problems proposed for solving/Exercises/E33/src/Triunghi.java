public class Triunghi extends Figura {
    private double latura1;
    private double latura2;
    private double latura3;

    public Triunghi(String culoare, double latura1, double latura2, double latura3) {
        super("Triunghi", culoare);
        this.latura1 = latura1;
        this.latura2 = latura2;
        this.latura3 = latura3;
    }

    public void setLatura1(double latura1) {
        this.latura1 = latura1;
        observator.notifyChange();
    }

    public void setLatura2(double latura2) {
        this.latura2 = latura2;
        observator.notifyChange();
    }

    public void setLatura3(double latura3) {
        this.latura3 = latura3;
        observator.notifyChange();
    }

    @Override
    public double calculPerimetru() {
        return latura1 + latura2 + latura3;
    }
}
