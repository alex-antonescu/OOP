public class GreutateDubla extends Greutate{
    private Greutate g1;
    private Greutate g2;



    public GreutateDubla(Greutate g1, Greutate g2){
        super(g1.capacitate());
        this.g1 = g1;
        this.g2 = g2;
    }

    public void setGreutateG1(Greutate g1) {
        this.g1 = g1;
    }

    public void setGreutateG2(Greutate g2) {
        this.g2 = g2;
    }

    @Override
    public int capacitate(){
        return g1.capacitate()+ g2.capacitate();
    }
}
