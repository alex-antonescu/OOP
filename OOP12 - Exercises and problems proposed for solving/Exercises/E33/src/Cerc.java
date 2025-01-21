public class Cerc extends Figura {
    private double raza;


    public Cerc(String culoare, int raza) {
        super("Cerc", culoare);
        this.raza = raza;
    }

    public void setRaza(double raza) {
        this.raza = raza;
        observator.notifyChange();
    }

    @Override
    public double calculPerimetru() {
        return 2 * Math.PI * raza;
    }
}
