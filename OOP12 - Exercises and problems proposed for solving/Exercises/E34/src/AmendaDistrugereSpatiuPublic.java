public class AmendaDistrugereSpatiuPublic extends Amenda{
    private int valoareBun;

    public AmendaDistrugereSpatiuPublic(String CNP, int valoareBun) {
        super(CNP);
        this.valoareBun = valoareBun;
    }

    @Override
    public int valoareAmenda() {
        return 300*valoareBun;
    }

    @Override
    public String getTip() {
        return "Distrugere";
    }
}
