public class CastBug extends Bug {
    private String tipDefault;
    private String tipConverted;

    public CastBug(String tipDefault, String tipConverted) {
        super("CastBug");
        this.tipDefault = tipDefault;
        this.tipConverted = tipConverted;
    }

    @Override
    public void afisareDenumireBug() {
        System.out.println(super.nume + ": " + tipDefault + " - " + tipConverted);
    }
}
