public class Variabila implements Expresie{
    public Expresie calculDerivata(){
        return new Constanta(1);
    }

    public String toString(){
        return "x";
    }
}
