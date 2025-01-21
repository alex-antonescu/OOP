public class AmendaParcare extends Amenda{

    public AmendaParcare(String CNP) {
        super(CNP);
    }

    @Override
    public int valoareAmenda() {
        return 500;
    }

    @Override
    public String getTip() {
        return "Parcare Interzisa";
    }

}
