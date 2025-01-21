public class Pluton extends UnitateLupta {
    private UnitateLupta[] membri = new UnitateLupta[10];
    private int nr_membri = 0;

    public void ranire(int valoare) {
        for (int i = 0; i < nr_membri; i++) {
            if (membri[i].esteVie()) {
                membri[i].ranire(valoare);
                break;
            }
        }
    }

    public void loveste(UnitateLupta unitate) {
        for (int i = 0; i < nr_membri; i++) {
            membri[i].loveste(unitate);
        }
    }

    public boolean esteVie() {
        if (nr_membri == 0) {
            return true;
        }
        for (int i = 0; i < nr_membri; i++) {
            if (membri[i].esteVie()) {
                return true;
            }
        }
        return false;
    }

    public boolean adauga(UnitateLupta unitate) {
        if (!unitate.esteVie() || !this.esteVie()) {
            return false;
        }
        if (nr_membri == membri.length) {
            UnitateLupta[] tmp = new UnitateLupta[membri.length + 10];
            for (int i = 0; i < membri.length; i++) {
                tmp[i] = membri[i];
            }
            membri = tmp;
        }

        membri[nr_membri] = unitate;
        nr_membri++;
        return true;
    }
}

