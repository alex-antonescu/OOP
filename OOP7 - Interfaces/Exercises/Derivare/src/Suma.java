public class Suma extends ExpresieBinara{
    public Suma(Expresie st, Expresie dr){
        super(st,dr);
    }

    public Expresie calculDerivata(){
        return new Suma(st.calculDerivata(),dr.calculDerivata());
    }


    public String toString() {
        return "(" +st.toString() + " + " + dr.toString() + ")";
    }

    public String getOperator(){
        return "Suma";
    }

}
