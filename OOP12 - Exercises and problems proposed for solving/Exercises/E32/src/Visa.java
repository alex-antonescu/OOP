public class Visa extends Card{
    private String CVV;

    public Visa(String numeUtilizator, String IBAN, String CVV) {
        super(numeUtilizator, IBAN);
        this.CVV = CVV;
        super.tip = "Visa";
    }

}
