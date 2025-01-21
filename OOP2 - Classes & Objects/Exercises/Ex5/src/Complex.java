public class Complex {
    private int real;
    private int imaginar;
    public static int nrComplexeTotale;

    public Complex(int real, int imaginar) {
        this.real = real;
        this.imaginar = imaginar;
    }

    public double moduloNr() {
        return Math.sqrt(real * real + imaginar * imaginar);
    }

    public void afisareNr() {
        nrComplexeTotale++;
        System.out.println("Numarul este: " + real + "i" + imaginar);
    }

    public Complex sumaADouaComplexe(Complex c1, Complex c2) {

        int parteReal = c1.real + c2.real;
        int parteImaginar = c1.imaginar + c2.imaginar;

        Complex sumaADouaComplexe = new Complex(parteReal, parteImaginar);

        return sumaADouaComplexe;
    }


}
