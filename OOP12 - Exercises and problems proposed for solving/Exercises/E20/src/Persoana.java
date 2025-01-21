import java.util.ArrayList;
import java.util.Iterator;

public class Persoana {
    private String nume;
    private String functie;
    private double venit;
    private int varsta;
    private static ArrayList<Persoana> listaPersoane = new ArrayList<>();


    public Persoana(){};

    public Persoana(String nume, String functie, double venit, int varsta) {
        this.nume = nume;
        this.functie = functie;
        this.venit = venit;
        this.varsta = varsta;
    }

    public void addPersoana() {
        listaPersoane.add(this);
    }

    public  void showListaPersoane() {
        listaPersoane.forEach(System.out::println);
    }

    public void crestereSalariu() {
        Iterator<Persoana> iterator = listaPersoane.iterator();
        while (iterator.hasNext()) {
            Persoana p = iterator.next();
            if (p.functie.equalsIgnoreCase("programator")) {
                p.venit += 1000;
            }
        }
    }

    @Override
    public String toString() {
        return "Persoana: " + nume + ", venit: " + venit;
    }
}
