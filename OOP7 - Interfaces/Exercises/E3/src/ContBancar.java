public class ContBancar {
    private String numarCont;
    private float suma;

    public ContBancar(float suma, String numarCont) {
        this.suma = suma;
        this.numarCont = numarCont;
    }

    public String getNumarCont() {
        return numarCont;
    }

    public void setNumarCont(String numarCont) {
        this.numarCont = numarCont;
    }

    public float getSuma() {
        return suma;
    }

    public void setSuma(float suma) {
        this.suma = suma;
    }
}
