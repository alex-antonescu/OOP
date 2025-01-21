public class Calaret extends UnitateSimpla{
    private static final int VIATA_CALARET = 200;
    private static final int PUTERE_CALARET = 15;
    private static int nr_cai = 0;

    public Calaret() {
        super(VIATA_CALARET, PUTERE_CALARET);
    }

    public static int getNrCaiPierduti(){
        return nr_cai;
    }

    public void ranire(int valoare){
        boolean inainte_de_ranire = this.esteVie();
        super.ranire(valoare);
        boolean dupa_ranire = this.esteVie();
        if((inainte_de_ranire == true) && (dupa_ranire == false)) {
            nr_cai++;
        }
    }
}
