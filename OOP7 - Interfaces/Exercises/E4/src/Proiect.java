import java.util.ArrayList;
import java.util.List;

public class Proiect implements IRisky {

    private String titlu;
    private String obiectiv;
    private Manager manager;
    private List<Member> membrii;
    private long fonduri;


    public Proiect(){};

    public Proiect(String titlu, String obiectiv, Manager manager,long fonduri)  {
        this.titlu = titlu;
        this.obiectiv = obiectiv;
        this.manager = manager;
        this.membrii = new ArrayList<>();
        this.fonduri = fonduri;
    }

    public long getFonduri() {
        return fonduri;
    }

    public List<Member> getMembrii() {
        return membrii;
    }

    @Override
    public String toString() {
        return "Proiect " + this.titlu;
    }

    @Override
    public double getRisk() {
        return 0;
    }

    public void addMember(Member m){
        membrii.add(m);
    }
}
