import java.util.ArrayList;
import java.util.List;

public class Client {
    private String nume;
    private String adresa;
    private List<ContBancar> listaConturi;

    public Client(String nume, String adresa, ContBancar cont) {
        this.nume = nume;
        this.adresa = adresa;
        this.listaConturi = new ArrayList<>();
        listaConturi.add(cont);
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public List<ContBancar> getListaConturi() {
        return listaConturi;
    }

    public void setListaConturi(List<ContBancar> listaConturi) {
        this.listaConturi = listaConturi;
    }

    public void afisareConturi(){
        for(ContBancar cont : listaConturi){
            System.out.println(cont.getNumarCont());
        }
    }

    public void addCont(ContBancar cont){
        if(listaConturi.size()<5)
            listaConturi.add(cont);
        else System.out.println("Maxim 5 conturi! Nu poti adauga alt cont!");
    }
}