package reader.input.text;

import elemente.Cerc;
import elemente.Patrat;
import elemente.Punct;
import reader.input.IReaderInput;

import java.util.Scanner;

public class ReaderInputText implements IReaderInput {
    @Override
    public Punct citirePunct() {
        Punct figura = new Punct();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ce figura doresti sa introduci?");
        System.out.println("Pentru Cerc apasa 1, pentru Patrat apasa 2");

        int alegere = scanner.nextInt();
        switch (alegere) {
            case 1 -> {
                System.out.println("Super, acum poti introduce caracteristicile cercului");

                System.out.println("Cercul este caracterizat prin origine:");
                System.out.print("Introdu valoarea lui x: ");
                int x = scanner.nextInt();
                System.out.print("Introdu valoarea lui y: ");
                int y = scanner.nextInt();

                System.out.print("Introdu raza cercului:");
                int raza = scanner.nextInt();

                figura = new Cerc(x, y, raza);
            }

            case 2 -> {
                System.out.println("Super, acum poti introduce caracteristicile patratului");

                System.out.println("Patratul este caracterizat prin coltul stanga-sus");
                System.out.println("Introdu valoarea lui x: ");
                int x1 = scanner.nextInt();
                System.out.println("Introdu valoarea lui y: ");
                int y1 = scanner.nextInt();

                System.out.println("Patratul este caracterizat prin coltul stanga-jos");
                System.out.println("Introdu valoarea lui x: ");
                int x2 = scanner.nextInt();
                System.out.println("Introdu valoarea lui y: ");
                int y2 = scanner.nextInt();
                figura = new Patrat(x1, y1, x2, y2);
            }
            default -> System.out.println("Optiune invalida!");
        }

        return figura;
    }

    @Override
    public int citireOptiune() {
        Scanner scanner = new Scanner(System.in);
        int optiune = scanner.nextInt();

        return optiune;
    }
}
