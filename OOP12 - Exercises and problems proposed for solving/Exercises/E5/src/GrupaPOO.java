public class GrupaPOO {
    private int nrStudenti;

    public GrupaPOO(int nrStudenti) {
        try {
            if(nrStudenti<12||nrStudenti>15){
                throw new IllegalArgumentException();
            }
            this.nrStudenti = nrStudenti;
        }catch (IllegalArgumentException e){
            System.out.println("Nr. studentilor poate fi cuprins intre 12 si 15");
        }
    }

    public int getNrStudenti() {
        System.out.println("Nr studenti: " + nrStudenti);
        return nrStudenti;
    }
}
