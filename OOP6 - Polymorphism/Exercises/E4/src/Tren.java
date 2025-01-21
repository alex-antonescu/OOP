import java.util.Arrays;

public class Tren {
    private Vagon vagon;
    private VagonCalatoriA vagonA;
    private VagonCalatoriB vagonB;
    private Vagon[] toateVagoanele = new Vagon[15];
    private Vagon[] updatedToateVagoanele;

    public Tren(int nrVagon, int nrVagonA, int nrVagonB) {
        this.vagon = new Vagon(400);
        this.vagonA = new VagonCalatoriA(300, 40);
        this.vagonB = new VagonCalatoriB(400, 50);

        populareTren(0, nrVagon, vagon);
        populareTren(nrVagon, nrVagonA + nrVagon, vagonA);
        populareTren(nrVagonA + nrVagon, nrVagonB + nrVagonA + nrVagon, vagonB);

        updatedToateVagoanele = Arrays.copyOf(toateVagoanele,nrVagon+nrVagonA+nrVagonB);


    }

    private void populareTren(int start, int stop, Vagon v) {
        for (int i = start; i < stop; i++) {
            toateVagoanele[i] = v;
        }
    }

    public int getNrColeteTotale() {
        int suma = 0;
        for (int i = 0; i <updatedToateVagoanele.length ; i++) {
            suma += updatedToateVagoanele[i].getMaxNumarColete();
        }
        return suma;
    }

    public boolean comparareTrenuri(Tren t) {
        boolean egalitate = false;

        if (this.getNrColeteTotale() == t.getNrColeteTotale()) {
            egalitate = true;
        }
        System.out.println(egalitate);
        return egalitate;
    }

    public void afisareTipuriVagoane() {
        for (Vagon v : updatedToateVagoanele) {
            System.out.println(v);
        }
    }


}


