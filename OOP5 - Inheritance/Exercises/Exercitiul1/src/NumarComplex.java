public class NumarComplex {
    protected double re, im;

    public NumarComplex(double re, double im){
        this.re = re;
        this.im = im;
    }

    public double modul(){
        return Math.sqrt(re*re + im*im);
    }

    @Override
    public String toString(){
        return re + " + " + im + " * i";
    }

}
