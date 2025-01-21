public class NumarComplex {
    protected double re, im;

    public NumarComplex() {
    }

    public NumarComplex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double modul() {
        return Math.sqrt(re * re + im * im);
    }

    public NumarComplex adunare(NumarComplex y){
        return new NumarComplex(re +y.re,im +y.im);
    }

    public String toString() {
        return re + " + " + im + "*i";
    }

    public NumarComplex inmultire(NumarComplex y) {
        return new NumarComplex
                (re * y.re - im * y.im,
                re * y.im + im * y.re);
    }
}
