import java.io.*;

public class ScriereMatriceRezultata {

    private InmultireMatrice rezultat;

    public ScriereMatriceRezultata(InmultireMatrice rezultat) {
        this.rezultat = rezultat;
    }

    public void scriereMatriceFisier() {
        try {
            FileWriter writer = new FileWriter("rezultat.txt");
            BufferedWriter buffer = new BufferedWriter(writer);

            Double[][] r = rezultat.calculate();
            for (int i = 0; i < r.length; i++) {
                for (int j = 0; j < r[i].length; j++) {
                    buffer.write(r[i][j] + " ");
                }
                buffer.newLine();
            }
            buffer.close();
            System.out.println("SUCCES!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
