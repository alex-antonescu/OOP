//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        NumarComplex a = new NumarComplex(1,1);
        System.out.println("Numarul este: " + a);
        System.out.println("Modulul sau este " + a.modul());

        NumarReal c = new NumarReal(5);
        NumarReal d = new NumarReal(-6);

        System.out.println("Primul numar este: " + c);
        System.out.println("Modulul sau este: " + c.modul());
        System.out.println("Al doilea numar este: " + d);
        System.out.println("Modulul sau este: " + d.modul());
        System.out.println("E primul numar mai mare ca al doilea? - " +
                c.maiMare(d));
        }
    }