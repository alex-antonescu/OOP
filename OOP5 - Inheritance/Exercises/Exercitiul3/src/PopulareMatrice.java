import java.util.Scanner;

public class PopulareMatrice {

    private GenerareMatrice generareMatrice;
    private NumarComplex[][] MatricePopulata;

    public PopulareMatrice() {
        this.generareMatrice = new GenerareMatrice();
        this.MatricePopulata = generareMatrice.getMatriceNepopulata();
    }

    public NumarComplex[][] getMatricePopulata() {
        return MatricePopulata;
    }

    public void introducereValori() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < generareMatrice.getLinii(); i++) {
            for (int j = 0; j < generareMatrice.getColoane(); j++) {
                System.out.println("Poti introduce elementul dorit");
                System.out.println("Prima data apasa r - real sau c - complex");
                char alegere = scanner.next().charAt(0);

                while (true) {
                    if (alegere == 'r') {
                        System.out.println("Acum poti introduce numarul tau real in elementul [" + i + "]" + "[" + j + "]");
                        double re = scanner.nextDouble();
                        MatricePopulata[i][j] = new NumarReal(re);
                        break;
                    } else if (alegere == 'c') {
                        NumarComplex x = new NumarComplex();
                        System.out.println("Acum poti introduce numarul tau complex in elementul [" + i + "]" + "[" + j + "]");
                        System.out.println("Introdu partea reala: ");
                        x.re = scanner.nextDouble();
                        System.out.println("Introdu partea imaginara: ");
                        x.im = scanner.nextDouble();
                        MatricePopulata[i][j] = x;
                        break;
                    }
                    System.out.println("Aparent nu ai introdus un caracter valabil, mai incearca!");
                    alegere = scanner.next().charAt(0);
                }
            }
        }
    }


}
