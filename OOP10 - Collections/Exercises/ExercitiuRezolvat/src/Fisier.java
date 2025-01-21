public class Fisier implements Intrare{
    private String informatie;
    public Fisier(String informatie){
        this.informatie = informatie;
    }

    public String continut(){
        return informatie;
    }
}
