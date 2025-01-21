import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class GenerareMatrice {

    private Scanner scanner = new Scanner(System.in);
    private DateMatrice data;
    private Double[][] matrice;

    public GenerareMatrice(DateMatrice data) {
        this.data = data;
        this.matrice = new Double[data.getRand()][data.getColoana()];
    }

    public Double[][] populareMatrice(){
        for(int i = 0; i< data.getRand(); i++){
            for(int j = 0; j< data.getColoana(); j++){
                System.out.println("Introdu elementul pentru m[" +i+"]" +"["+j+"]:");
                matrice[i][j] = scanner.nextDouble();
            }
        }
        return matrice;
    }
}
