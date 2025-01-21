//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Corner, Gol, Out {
        //Creare obiecte de tip joc;
        Joc j1 = new Joc();
        Joc j2 = new Joc();

        //Simulare joc
        j1.simuleaza();
        j2.simuleaza();

        //Afisare statistici
        System.out.println("\n" + j1);
        System.out.println("\n" + j2);
    }
}