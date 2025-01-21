//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        var dateMatrice1 = new DateMatrice();
        var dateMatrice2 = new DateMatrice();

        InmultireMatrice result = new InmultireMatrice(dateMatrice1,dateMatrice2);
        //result.showResult();

        ScriereMatriceRezultata scriere = new ScriereMatriceRezultata(result);
        scriere.scriereMatriceFisier();

        }
    }
