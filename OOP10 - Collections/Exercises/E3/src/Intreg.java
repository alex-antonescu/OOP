public class Intreg extends Tip{
    private int intreg;

    public Intreg(int intreg) {
        this.intreg = intreg;
    }

    @Override
    public String getTip() {
        return super.getTip() + "Intreg";
    }

    @Override
    public String toString() {
       return String.valueOf(intreg);
    }
}
