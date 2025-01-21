import elemente.Stiva;
import reader.input.text.ReaderInputText;
import reader.output.text.ReaderOutputText;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        Main.generateManipulateDisplayStiva();
    }

    public static void generateManipulateDisplayStiva() throws Exception {
        Stiva s = new Stiva();
        ReaderInputText readerInputText = new ReaderInputText();
        boolean running = true;

        while(running) {
            System.out.println("Optiuni:");
            System.out.println("1. Introdu un element nou in stiva.");
            System.out.println("2. Returneaza si sterge ultimul element din stiva.");
            System.out.println("3. Afiseaza elementele din stiva.");
            System.out.println("4. Exit");
            int optiune = readerInputText.citireOptiune();
            switch (optiune) {
                case 1 -> s.introducereElement(readerInputText.citirePunct());
                case 2 -> s.returnareStergereUltimElement();
                case 3 -> s.afisareElementeStiva();
                case 4 -> {
                    System.out.println("Exit...");
                    running = false;
                }
                default -> System.out.println("Invalid");
            }
        }

        ReaderOutputText readerOutputText = new ReaderOutputText();
        readerOutputText.afisareStiva(s);


    }
}