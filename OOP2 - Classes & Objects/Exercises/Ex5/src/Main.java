import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introdu partea reala: ");
        int parteaReala = scanner.nextInt();

        System.out.print("Introdu partea reala: ");
        int parteaImaginara = scanner.nextInt();

        Complex myNumber = new Complex(parteaReala, parteaImaginara);

        myNumber.afisareNr();
        System.out.println("Modulul numarului este: " + myNumber.moduloNr());

        Complex firstComplex = new Complex(1, 2);
        Complex secondComplex = new Complex(3, 4);

        Complex calcule = new Complex(0, 0);
        calcule = calcule.sumaADouaComplexe(firstComplex, secondComplex);

        calcule.afisareNr();
        System.out.println(Complex.nrComplexeTotale);
    }
}
