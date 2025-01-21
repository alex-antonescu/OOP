public class StrategiePeUtilizator implements Strategie{
    private String numeUtilizator;

    public StrategiePeUtilizator(String numeUtilizator) {
        this.numeUtilizator = numeUtilizator;
    }

    @Override
    public boolean conditie(Card card) {
        return card.getNumeUtilizator().equals(numeUtilizator);
    }
}
