public class ContBancarLei extends ContBancar implements SumaTotala {
    public ContBancarLei(float suma, String numarCont) {
        super(suma, numarCont);
    }


    @Override
    public float getSumaTotala(){
        return getSuma();
    }

    public void transfer(ContBancar contDestinatie, float suma) {
        this.setSuma(this.getSuma()-suma);
        contDestinatie.setSuma(contDestinatie.getSuma()+suma);
    }
}
