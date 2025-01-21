import java.util.ArrayList;
import java.util.List;

public class Contribuabil {
    private String nume;
    private String prenume;
    private String CNP;
    private List<Proprietate> proprietati;


    public Contribuabil(String nume, String prenume, String CNP) {
        this.nume = nume;
        this.prenume = prenume;
        this.CNP = CNP;
        proprietati = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Contribuabil: " + nume + " " + prenume + "\n";

    }

    public void adaugareProprietate(Proprietate p) {
        proprietati.add(p);
    }

    public void afisareProprietatiSiTaxe() {
        int suma = 0;
        System.out.println(this);
        System.out.println("Proprietati:");
        for (Proprietate p : proprietati) {
            suma += p.impozit();
            System.out.println(p);
        }
        System.out.println("Suma totala: " + suma);
    }
}