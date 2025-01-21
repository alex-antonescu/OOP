public class Patrat extends Figura{
    private double latura;

    public Patrat(String culoare, double latura) {
        super("Patrat", culoare);
        this.latura = latura;
    }

    public void setLatura(double latura) {
        this.latura = latura;
        observator.notifyChange();
    }

    @Override
    public double calculPerimetru() {
        return latura*latura;
    }
}
