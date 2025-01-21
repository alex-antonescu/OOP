import java.util.Scanner;

public class GenerareMatrice {
    private int linii;
    private int coloane;
    private NumarComplex[][] matriceNepopulata;

    public GenerareMatrice() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Salut, ofera-mi datele specifice matricei");

        System.out.println("Introdu numarul de linii: ");
        this.linii = scanner.nextInt();

        System.out.println("Introdu numarul de coloane: ");
        this.coloane = scanner.nextInt();

        this.matriceNepopulata = new NumarComplex[linii][coloane];
    }

    public int getLinii() {
        return linii;
    }

    public int getColoane() {
        return coloane;
    }

    public NumarComplex[][] getMatriceNepopulata() {
        return matriceNepopulata;
    }
}
