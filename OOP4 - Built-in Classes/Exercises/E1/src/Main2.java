import java.io.*;

public class Main2 {

    //Sa se citesca de la tastatura x numere si sa se scrie numerele pare intr-un fisier
    public static void main(String[] args) throws IOException {

        //Citire de la tastatura
        InputStreamReader streamReader = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(streamReader);

        //Scriere in fisier
        FileOutputStream file =
                new FileOutputStream("C:\\Users\\ALEX\\Desktop\\Laboratoare\\OOP4\\E1\\src\\ex1.txt");
        PrintStream out = new PrintStream(file);

        System.out.print("Cate numere vrei sa introduci?: ");
        int n = Integer.parseInt(input.readLine());

        int temporar;
        int suma = 0;

        for(int i = 0; i<n; i++){
            System.out.print("Introdu primul numar: ");
            temporar = Integer.parseInt(input.readLine());
            if(temporar%2==0){
                suma+=temporar;
                out.println(temporar);
            }
        }
        System.out.println("Suma este: " + suma);
        out.println(suma);
        out.close();
    }
}
