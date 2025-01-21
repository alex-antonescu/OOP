import java.io.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        int n, i, suma, temporar;

        try{
            //Dispozitive de citire/ scriere de la tastatura.
            BufferedReader in =
                    new BufferedReader(new InputStreamReader(System.in));
            PrintStream out =
                    new PrintStream(new FileOutputStream("out.txt"));

            System.out.println("Dati numarul de intregi:");
            n = Integer.parseInt(in.readLine());

            //Citire de la tastatura si scriere numere.
            suma = 0;
            for(i = 1; i <= n; i++) {
                System.out.println("dati numarul " + i + ":");
                temporar = Integer.parseInt(in.readLine());
                suma+=temporar;
                out.println(temporar);
            }
            out.println(suma);
            System.out.println("Suma este: " + suma);
            out.close();
        }catch (IOException e) {
            System.out.println("Eroare la in-out");
            System.exit(1);
        }


        }
    }