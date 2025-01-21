public class ContBancarEuro extends ContBancar implements SumaTotala {
    private final float DOBANDA = 0.3f;
    private final float DOBANDADEFAULT = 0f;

    public ContBancarEuro(float suma, String numarCont) {
        super(suma, numarCont);
    }

    @Override
    public float getSumaTotala() {
        return getSuma() * 36.000f;
    }

    public float getDobanda() {
        return (getSuma() > 500) ? DOBANDA : DOBANDADEFAULT;
    }

}
