import java.util.SortedSet;
import java.util.TreeSet;

public class Persoana implements Comparable<Persoana> {
    private String nume;
    private int varsta;
    private static SortedSet<Persoana> persoanas = new TreeSet<>();

    public Persoana(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    public String getNume() {
        return nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public static void showPersoane(){
        for(var p : persoanas){
            System.out.println(p);
        }
    }

    public static void addPersoana(Persoana p){
        persoanas.add(p);
    }

    @Override
    public String toString() {
        return "Persoana:" + " nume " + nume + ", varsta=" + varsta;
    }


    @Override
    public int compareTo(Persoana o) {
        return this.getNume().compareTo(o.getNume());
    }
}

