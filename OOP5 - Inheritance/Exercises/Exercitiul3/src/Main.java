//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        PopulareMatrice p1 = new PopulareMatrice();
        p1.introducereValori();

        PopulareMatrice p2 = new PopulareMatrice();
        p2.introducereValori();

        InmultireMatrice inmultireMatrice = new InmultireMatrice(p1,p2);
        inmultireMatrice.executaInmultire();

        inmultireMatrice.afiseazaRezultatul();
        }
    }