import java.util.ArrayList;
import java.util.List;

public class ColectieGreutati {
    private List<Greutate> colectieGreutati;

    public ColectieGreutati() {
        this.colectieGreutati = new ArrayList<>();
    }

    public void adauga(Greutate g){
        colectieGreutati.add(g);
    }

    public double medie() {
        int nrGreutati = 0;
        int capaciatate = 0;
        for (Greutate g : colectieGreutati) {
            nrGreutati++;
            capaciatate += g.capacitate();
        }
        return capaciatate/nrGreutati;
    }
}
