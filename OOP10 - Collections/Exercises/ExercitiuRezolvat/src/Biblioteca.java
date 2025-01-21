import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Carte> carti = new ArrayList<Carte>();

    public void add(Carte c){
        carti.add(c);
    }

    public String toString(){
        return carti.toString();
    }
}
