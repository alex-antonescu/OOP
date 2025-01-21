import java.lang.reflect.Array;
import java.util.Arrays;

public class Depozit {
    private Produs[] listaProduse;

    public Depozit() {
        this.listaProduse = new Produs[0];
    }

    public boolean cautareProdus(Produs p) {
        boolean isFound = false;
        for (int i = 0; i < listaProduse.length; i++) {
            if (p.equals(listaProduse[i])) {
                isFound = true;
                break;
            }
        }
        return isFound;
    }

    public void adaugareProdus(Produs p, int cantitateAdaugata) {
        boolean isFound = cautareProdus(p);

        if (!isFound) {
            listaProduse = Arrays.copyOf(listaProduse, listaProduse.length + 1);
            listaProduse[listaProduse.length - 1] = p;
        }
        p.setCantitate(p.getCantitate() + cantitateAdaugata);
    }

    public void afisareProduseDepozit() {
        for (int i = 0; i < listaProduse.length; i++) {
            System.out.println(listaProduse[i]);
        }
    }
}
