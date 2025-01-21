public class VagonCalatoriB extends VagonCalatoriA {
    public VagonCalatoriB(int maxNumarColete, int maxNumarPasageri) {
        super(maxNumarColete, maxNumarPasageri);
    }

    public void blocareAutomataGeamuri(){
        System.out.println("Geamurile s-au blocat automat!");
    }

    @Override
    public String toString() {
        return "VagonCalatoriB," + " maxNumarPasageri: " + getMaxNumarPasageri() + ", maxNumarColete: "+super.getMaxNumarColete();
    }
}
