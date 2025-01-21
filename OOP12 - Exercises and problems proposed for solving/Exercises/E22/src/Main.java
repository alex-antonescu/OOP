import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //Generarea persoanelor
        Persoana p1 = new Persoana("Alex","9111111112222211");
        Persoana p2 = new Persoana("Ion","81111222221111221");
        Persoana p3 = new Persoana("Gigel","711111111122222");
        Persoana p4 = new Persoana("Costel","511111111122222");

        //Generare setPersoane
          Set<Persoana> set1 = new HashSet<>();
          Set<Persoana> set2 = new HashSet<>();

          set1.add(p1);
          set1.add(p2);
          set1.add(p3);
          set1.add(p4);

          set2.add(p2);
          set2.add(p3);

          Set<Persoana> set3 = Persoana.intersectie(set1,set2);

//          set1.forEach(System.out::println);
//          set2.forEach(System.out::println);
          set3.forEach(System.out::println);


    }
}
