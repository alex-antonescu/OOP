public class Main {
    public static void main(String[] args) {
        //Generare Buguri
        Bug b1 = new NullBug("r1");
        Bug b2 = new NullBug("r2");
        Bug b3 = new CastBug("t1","t2");

        //Generare clase
        Clasa c1 = new Clasa("c1",7);
        Clasa c2 = new Clasa("c2",7);
        Clasa c3 = new Clasa("c3",7);
        c1.addBug(b1);
        c1.addBug(b2);
        c1.addBug(b3);


        //Generare fisiere
        Fisier f1 = new Fisier("a","alex");
        Fisier f2 = new Fisier("b","aaalex");
        Fisier f3 = new Fisier("c","aaalex");
        Fisier f4 = new Fisier("d","lex");
        Fisier f5 = new Fisier("e","lex");
        f1.addClass(c1);
        f1.addClass(c2);
        f1.addClass(c3);

        //Populare sistem;
        Sistem s = new Sistem();
        s.addFisier(f1);
        s.addFisier(f2);
        s.addFisier(f3);
        s.addFisier(f4);
        s.addFisier(f5);

        s.infoSistem();
    }
}
