public class InmultireMatrice {

    private int rand;
    private int coloana;
    private GenerareMatrice m1;
    private GenerareMatrice m2;
    private Double[][] r;

    public InmultireMatrice(DateMatrice A, DateMatrice B) {
        this.rand = A.getRand();
        this.coloana = B.getColoana();
        this.m1 = new GenerareMatrice(A);
        this.m2 = new GenerareMatrice(B);
        r = new Double[A.getRand()][B.getColoana()];
    }

    public int getColoana() {
        return coloana;
    }

    public int getRand() {
        return rand;
    }

    public Double[][] calculate() {

        Double[][] d1 = m1.populareMatrice();
        Double[][] d2 = m2.populareMatrice();

        for (int i = 0; i < rand; i++) {
            for (int j = 0; j < coloana; j++) {
                r[i][j] =0.0;
                for (int k = 0; k < d1[0].length; k++) {
                    r[i][j] += d1[i][k] * d2[k][j];
                }
            }
        }
        return r;
    }

    public void showResult() {
        Double[][] result = calculate();
        System.out.println("Rezultatul înmulțirii este:");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.println(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
