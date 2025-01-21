import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class POLITIA{
    private List<Amenda> amenziAcordate;

    public POLITIA() {
        this.amenziAcordate = new LinkedList<>();
    }

    public void addAmenda(Amenda amenda){
        amenziAcordate.add(amenda);
    }

    public int valoare(Strategie strategie){
        int sumaToatala = 0;
        for(var amenda : amenziAcordate){
            if(strategie.conditie(amenda)){
                sumaToatala+=amenda.valoareAmenda();
            }
        }
        return sumaToatala;
    }

}
