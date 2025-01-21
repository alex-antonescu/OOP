//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Agent a1 = new Agent("Alex");
        Agent a2 = new Agent("Ion");

        Casierita c = new Casierita();

        a1.start();
        a2.start();

        c.start();
    }
}