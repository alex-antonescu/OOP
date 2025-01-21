import java.util.ArrayList;

public class Director implements Intrare {
    private ArrayList<Intrare> intrari = new ArrayList<>();

    public void adauga(Intrare intr){
        intrari.add(intr);
    }

    public String continut(){
        String tmp = "";
        for(Intrare i : intrari){
            tmp = tmp + i.continut();
        }
        return tmp;
    }
}
