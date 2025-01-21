public class Carte {
    private String autor;
    private String titlu;

    public Carte(String autor, String titlu) {
        this.autor = autor;
        this.titlu = titlu;
    }

    @Override
    public String toString() {
        return autor + " " + titlu;
    }

}
