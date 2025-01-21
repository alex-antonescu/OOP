import java.util.Arrays;

public class Card {
    protected String tip;
    private String numeUtilizator;
    private char[] IBAN = new char[16];

    public Card(){};

    public Card(String numeUtilizator, String IBAN) {
        if(numeUtilizator.length()>15)
            throw new ArgumentIllegalException();
        this.numeUtilizator = numeUtilizator;

        if(IBAN.length()!=16)
            throw new ArgumentIllegalException();
        for(int i = 0; i<15; i++){
            this.IBAN[i] = IBAN.charAt(i);
        }
    }

    public String getNumeUtilizator() {
        return numeUtilizator;
    }

    public char[] getIBAN() {
        return IBAN;
    }

    @Override
    public String toString() {
        return "Card: " + tip + '\'' + ", posesor: "  + numeUtilizator + '\'' + ", IBAN=" + Arrays.toString(IBAN);
    }
}
