import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Intreg i1 = new Intreg(7);
        Intreg i2 = new Intreg(4);
        Sir s1 = new Sir("Eu");
        Intreg i3 = new Intreg(12);

        ArrayList<Tip> lista = new ArrayList<>();
        lista.add(i1);
        lista.add(i2);
        lista.add(s1);

        Colectie c = new Colectie(lista);
        c.addElement(i3);
        System.out.println(c);

        Colectie c2 = new Colectie();
        System.out.println(c2.equals(c));
    }

}