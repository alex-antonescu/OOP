public class NullBug extends Bug{
    private String referinta;

    public NullBug(String referinta) {
        super("NullBug");
        this.referinta = referinta;
    }

    @Override
    public void afisareDenumireBug() {
        System.out.println(super.nume+" "+referinta);
    }
}
