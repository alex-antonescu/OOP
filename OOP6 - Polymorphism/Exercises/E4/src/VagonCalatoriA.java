public class VagonCalatoriA extends Vagon{
    private int maxNumarPasageri;

    public VagonCalatoriA(int maxNumarColete, int maxNumarPasageri) {
        super(maxNumarColete);
        this.maxNumarPasageri = maxNumarPasageri;
    }

    public int getMaxNumarPasageri() {
        return maxNumarPasageri;
    }

    public void deschidereAutomataUsi(){
        System.out.println("Se deschid usile!");
    }

    public void inchidereAutomataUsi(){
        System.out.println("Se inchid usile!");
    }

    @Override
    public String toString() {
        return "VagonCalatoriA," + " maxNumarPasageri: " + maxNumarPasageri + ", maxNumarColete: "+super.getMaxNumarColete();
    }
}
