public class StrategieParcareInterzisa implements Strategie {

    @Override
    public boolean conditie(Amenda amenda) {
        return amenda.getTip().equals("Parcare Interzisa");
    }
}
