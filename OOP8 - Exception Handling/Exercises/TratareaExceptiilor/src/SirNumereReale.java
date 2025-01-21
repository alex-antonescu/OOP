public class SirNumereReale {

    private double[] sir = new double[100];
    private int nr = 0;
    private boolean exceptie = false;

    public boolean testExceptie() {
        return exceptie;
    }

    public boolean adauga(double x){
        if(nr == sir.length) {
            return false;
        }
        sir[nr] = x;
        nr++;
        return true;
    }

    public double extragereDupa(double x) {
        for(int i = 0; i < nr; i++){
            if(sir[i] == x){
                if(i+1 < nr){
                    double result = sir[i+1];
                    for(int j = i+1; j<nr-1; j++){
                        sir[j] = sir[j+1];
                    }
                    nr--;
                    exceptie = false;
                    return result;
                }
                else {
                    exceptie = true;
                    return -2;
                }
            }
        }
        exceptie = true;
        return -1;
    }
}
