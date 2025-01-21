public class InmultireMatrice {
    private NumarComplex[][] M1;
    private NumarComplex[][] M2;
    private NumarComplex[][] R;

    public InmultireMatrice(PopulareMatrice p1, PopulareMatrice p2) {
        M1 = p1.getMatricePopulata();
        M2 = p2.getMatricePopulata();
        R = new NumarComplex[M1.length][M2[0].length];
    }

    public void executaInmultire(){
        for(int i = 0; i<= M1.length-1; i++){
            for(int j = 0; j<=M2[0].length-1; j++){
                NumarComplex suma = new NumarComplex();
                for(int k=0;k<=M2.length-1; k++){
                   suma = suma.adunare(M1[i][k].inmultire(M2[k][j]));
                }
                R[i][j] = suma;
            }
        }
    }

    public void afiseazaRezultatul(){
        for(NumarComplex[] linie :R){
            for(NumarComplex element: linie){
                System.out.print(element + ", ");
            }
            System.out.println();
        }
    }
}
