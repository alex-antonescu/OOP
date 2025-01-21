public class Main {
    public static void main(String[] args) {
        //Generare Observator & Figuri
        Observator o = new Observator();

        Cerc c = new Cerc("rosu",5);
        Cerc d = new Cerc("verde",5);
        Patrat p = new Patrat("galben",6);
        Triunghi t = new Triunghi("galben",9,9,9);

        o.addFigura(c);
        o.addFigura(p);
        o.addFigura(t);


        //Testare
        //o.showFiguri();
        //c.setRaza(100);
        System.out.println(c.egalitate(d));
    }
}
