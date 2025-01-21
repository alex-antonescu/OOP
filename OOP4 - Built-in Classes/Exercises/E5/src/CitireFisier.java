import java.util.ArrayList;
import java.util.Scanner;

public class CitireFisier {

    private Scanner sc;
    private String input;
    private ArrayList<String> listaFisiere;

    public CitireFisier() {
        this.sc = new Scanner(System.in);
        this.listaFisiere = new ArrayList<>();
        this.input = "";
    }

    public ArrayList<String> getListaFisiere() {
        return listaFisiere;
    }

    public ArrayList<String> start() {
        System.out.println("Salut, sa inceapa introducerea fisierelor!");
        while (true) {
            System.out.println("Introdu numele fisierelor care doresti sa fie analizate. " +
                    "Daca doresti sa inchei analiza apasa stop");
            input = sc.nextLine();

            if (input.equals("stop"))
                break;

            if (listaFisiere.contains(input)) {
                System.out.println("Uuups, nu poti introduce un element de 2 ori");
            }
            else {
                listaFisiere.add(input);
                System.out.println("Fisierul a fost adaugat");
            }
            System.out.println("Lista finala este: " + listaFisiere.toString());
        }
        System.out.println("Proces incheiat");
        return listaFisiere;
    }





}

