public class StrategieCNP implements Strategie{
    private String CNP;

    public StrategieCNP(String CNP) {
        this.CNP = CNP;
    }

    @Override
    public boolean conditie(Amenda amenda) {
        return amenda.getCNP().equals(CNP);
    }
}
