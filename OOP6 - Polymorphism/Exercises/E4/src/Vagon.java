public class Vagon {
    private int maxNumarColete;

    public Vagon(int maxNumarColete) {
        this.maxNumarColete = maxNumarColete;
    }

    public int getMaxNumarColete() {
        return maxNumarColete;
    }

    @Override
    public String toString() {
        return "Vagon Marfa," + " maxNumarColete: " + maxNumarColete;
    }
}
