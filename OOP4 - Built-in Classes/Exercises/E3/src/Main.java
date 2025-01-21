import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti o linie de text: ");
        String linieDeText = scanner.nextLine();

        System.out.println("Introduceti numele fisierului: ");
        String numeFisier = scanner.nextLine();

        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(numeFisier))) {
            String linieDeFisier;
            while ((linieDeFisier = reader.readLine()) != null) {
                if (linieDeFisier.equals(linieDeText)) {
                    count++;
                }
            }
        } catch (IOException e) {
            System.out.println("A aparut o eroare " + e.getMessage());
        }
        System.out.println("Nr de linii egale cu textul introdus este: " + count);
    }
}
