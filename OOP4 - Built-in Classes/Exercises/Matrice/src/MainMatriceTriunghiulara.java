public class MainMatriceTriunghiulara {
    public static void main(String[] args) {
        //O matrice triunghiulara
        int i;
        int[][] matrice_speciala = new int[10][];
        for (i = 0; i < 10; i++) {
            matrice_speciala[i] = new int[i + 1];
        }
        //Tiparirea elementelor ei
        int a, b;
        for (a = 0; a < matrice_speciala.length; a++) {
            for (b = 0; b < matrice_speciala[a].length; b++) {
                System.out.print(matrice_speciala[a][b] + " ");
            }
            System.out.println();
        }

    }
}
