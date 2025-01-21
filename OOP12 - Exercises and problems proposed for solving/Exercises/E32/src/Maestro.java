public class Maestro extends Card{
    private String CVV;

    public Maestro(String numeUtilizator, String IBAN, String CVV) {
        super(numeUtilizator, IBAN);
        this.CVV = CVV;
        super.tip = "Maestro";
    }
}
