import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Colectie {
    private  ArrayList<ArrayList<Tip>> colectie = new ArrayList<>();

    public Colectie(){}

    public Colectie(ArrayList<Tip> c) {
        colectie.add(c);
    }

    public String getTip(){
        return "Tip: Colectie";
    }

    public String toString(){
        String elemente = "";
        Iterator<ArrayList<Tip>> iterator = colectie.iterator();
        while(iterator.hasNext()){
            String next = "("+ iterator.next()+")";
            elemente = elemente.concat(next);
        }
        return elemente;
    }

    public void addElement(Tip element){
        colectie.add(new ArrayList<>(List.of(element)));
    }


    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Colectie colectie1)) return false;

        return Objects.equals(colectie, colectie1.colectie);
    }

}
