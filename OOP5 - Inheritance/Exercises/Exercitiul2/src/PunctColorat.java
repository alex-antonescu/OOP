public class PunctColorat extends Punct {
    //Punct colorat trebuie sa aiba declarat un constructor deoarece clasa pe care o extinde are
    //deja un constructor cu parametrii.
    //Mai mult, trebuie sa initilizam campul specific privat "culoare", si in acest caz constructorul vine,
    //din nou in ajutor.

    private String culoare;

    public PunctColorat(int x, int y, String culoare) {
        super(x, y);
        this.culoare = culoare;
        System.out.println(" Culoare: " + culoare);
    }
}
