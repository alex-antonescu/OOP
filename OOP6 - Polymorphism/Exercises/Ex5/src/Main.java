//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ColectieGreutati c1 = new ColectieGreutati();
        Greutate gs1 = new Greutate(100);
        Greutate gs2 = new Greutate(400);
        Greutate gd1 = new GreutateDubla(gs1,gs2);
        Greutate gm1 = new GreutateMultipla(1,1,gs1,gd1);

        c1.adauga(gs1);
        c1.adauga(gs2);
        c1.adauga(gd1);
        c1.adauga(gm1);

        System.out.println(c1.medie());

    }
}