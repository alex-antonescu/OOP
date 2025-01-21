public class Inmultire extends ExpresieBinara{
    public Inmultire(Expresie st, Expresie dr) {
        super(st,dr);
    }

    public Expresie calculDerivata() {
        Expresie t1 = new Inmultire(st,dr.calculDerivata());
        Expresie t2 = new Inmultire(st.calculDerivata(),dr);
        return new Suma(t1,t2);
    }

    public String toString() {
        return "(" + st.toString() + " * " + dr.toString() + ")";
    }

    public String getOperator(){
        return "Inmultire";
    }

}
