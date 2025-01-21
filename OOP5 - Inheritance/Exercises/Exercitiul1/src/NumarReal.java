public class NumarReal extends NumarComplex {
    public NumarReal(double re){
        super(re, 0);
    }

    public boolean maiMare(NumarReal a){
        return re > a.re;
    }
}
