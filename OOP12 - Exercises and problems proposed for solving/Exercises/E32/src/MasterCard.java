public class MasterCard extends Card{
    public MasterCard(String numeUtilizator, String IBAN) {
        super(numeUtilizator, IBAN);
        super.tip = "MasterCard";
    }
}
