import java.util.ArrayList;
import java.util.List;

public class Clasa {
    private String nume;
    private int liniiCod;
    private List<Bug> bugs;

    public Clasa(String nume, int liniiCod) {
        this.nume = nume;
        this.liniiCod = liniiCod;
        this.bugs = new ArrayList<>();
    }

    public int getLiniiCod() {
        return liniiCod;
    }

    public int getTotalBugs(){
        return bugs.size();
    }

    public void addBug(Bug bug){
        bugs.add(bug);
    }

}
