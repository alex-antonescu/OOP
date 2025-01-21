public class UnitateSimpla extends UnitateLupta{
    private int viata;
    private int putere;

    public UnitateSimpla(int viata, int putere) {
        this.viata = viata;
        this.putere = putere;
    }

    public void ranire(int valoare){
        if(esteVie()){
            viata = viata - valoare;
        }
    }

    public void loveste(UnitateLupta unitate){
        if(esteVie()) {
            unitate.ranire(putere);
        }
    }

    public boolean esteVie() {
        if(viata > 0) {
            return true;
        }else {
            return false;
        }
    }
}
