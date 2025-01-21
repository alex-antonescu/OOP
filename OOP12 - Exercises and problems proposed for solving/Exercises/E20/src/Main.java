import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        //Generare persoane
        Persoana p = new Persoana();
        Persoana p1 = new Persoana("Alex","Programator",8000,25);
        Persoana p2 = new Persoana("Ion","Mecanic",5000,25);
        Persoana p3 = new Persoana("Gigi","Inginer",7000,25);

        //Popularea listei de persoane
        p1.addPersoana();
        p2.addPersoana();
        p3.addPersoana();

        //Verificarea implementarii iteratorului
        p.showListaPersoane();
        System.out.println("=====!!!Update!!!=====");
        p.crestereSalariu();
        p.showListaPersoane();
    }
}
