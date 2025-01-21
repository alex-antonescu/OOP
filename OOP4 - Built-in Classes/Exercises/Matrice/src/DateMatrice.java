import java.util.Scanner;

public class DateMatrice {

    private Scanner scanner = new Scanner(System.in);
    private int rand;
    private int coloana;

    public int getRand() {
        return rand;
    }

    public int getColoana() {
        return coloana;
    }

    public DateMatrice(){
        System.out.println("Nr de randuri: ");
        this.rand = scanner.nextInt();
        System.out.println("Nr de coloane: ");
        this.coloana = scanner.nextInt();

    }
}
