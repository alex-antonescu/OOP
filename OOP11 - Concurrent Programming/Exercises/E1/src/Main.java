//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Creare autoturisme de capacitati diferite
        Autoturism Logan = new Autoturism(45);
        Autoturism Q5 = new Autoturism(75);
        Autoturism Passat = new Autoturism(70);
        Autoturism G = new Autoturism(100);
        Autoturism S1 = new Autoturism(1);

        //Creare cisterne de capacitati diferite
        Cisterna c3 = new Cisterna(300);
        Cisterna c5 = new Cisterna(500);
        Cisterna c7 = new Cisterna(700);

        //Pornim firele de executie
        c3.start();
        c5.start();
        c7.start();

        Q5.start();
        Passat.start();
        G.start();
        S1.start();


    }
}