//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Constanta c1 = new Constanta(1);
        Variabila v1 = new Variabila();
        Variabila v2 = new Variabila();
        Inmultire i1 = new Inmultire(v1,v2);
        Suma exp = new Suma(c1,i1);

        System.out.println(exp);

        Expresie deriv1 = exp.calculDerivata();
        System.out.println(deriv1);

        Expresie deriv2 = deriv1.calculDerivata();
        System.out.println(deriv2);
        }
    }