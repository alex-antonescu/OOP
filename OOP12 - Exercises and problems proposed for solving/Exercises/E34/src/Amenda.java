public abstract class Amenda {
    private String CNP;

    public Amenda(String CNP) {
        this.CNP = CNP;
    }

    public String getCNP() {
        return CNP;
    }
    public abstract String getTip();

    public abstract int valoareAmenda();

    @Override
    public String toString() {
        return "Amenda: " + getTip() + ", valaore = " + valoareAmenda();
    }
}
