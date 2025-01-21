abstract class ExpresieBinara implements Expresie {
    protected Expresie st;
    protected Expresie dr;

    public ExpresieBinara(Expresie st, Expresie dr) {
        this.st = st;
        this.dr = dr;
    }

    public abstract String getOperator();

    public String toString() {
        return "Operator stanga: " + st + "Operatie: " + getOperator() + " Operator dreapta: " + dr;
    }
}
