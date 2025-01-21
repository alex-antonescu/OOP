import java.util.ArrayList;
import java.util.List;

public class Fisier {
    private String nume;
    private String autor;
    private List<Clasa> clase;

    public Fisier(String nume, String autor) {
        this.nume = nume;
        this.autor = autor;
        this.clase = new ArrayList<>();
    }

    public String getAutor() {
        return autor;
    }

    public int getNumberOfClasses(){
        return clase.size();
    }

    public int getNumberOfBugs(){
        int nrBugs = 0;
        for(Clasa c : clase){
            nrBugs+=c.getTotalBugs();
        }
        return nrBugs;
    }

    public void addClass(Clasa clasa){
        clase.add(clasa);
    }

    @Override
    public String toString() {
        return "Fisier: " + nume;
    }
}
