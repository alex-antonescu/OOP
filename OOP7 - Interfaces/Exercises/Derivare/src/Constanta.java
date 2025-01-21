public class Constanta implements Expresie{
    private double valoare;

    public Constanta(double valoare){
        this.valoare = valoare;
    }

    public Expresie calculDerivata(){
        return new Constanta(0);
    }

    public String toString(){
        return valoare +"";
    }


}
