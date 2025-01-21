//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Carte c1 = new Carte("colectiv","ABC");
        Carte c2 = new Carte("UPT", "Java");
        Carte c3 = new Carte("INFO", "Java");

        Biblioteca b = new Biblioteca();
        b.add(c1);
        b.add(c2);
        b.add(c3);

        System.out.println(b);
    }
}