//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Initializare tren
        Tren t1 = new Tren(1,1,1);
        Tren t2 = new Tren(2,1,2);

        //Afisare tren
        t1.afisareTipuriVagoane();
        System.out.println();

        //Comparare tren
        t1.comparareTrenuri(t2);
    }
}