import java.util.Collections;
import java.util.List;

public class ProiectComercial extends Proiect {

    private String deadLine;
    private long fonduriMarketing;
    private int nrEchipe;

    public ProiectComercial(String titlu, String obiectiv, Manager manager, long fonduri, String deadLine) {
        super(titlu, obiectiv, manager, fonduri);
        this.fonduriMarketing = fonduri / 2;
        this.deadLine = deadLine;
    }

    public int getNrEchipe() {
        return nrEchipe;
    }

    public void setNrEchipe(int nrEchipe) {
        if (nrEchipe < this.getMembrii().size()) {
            this.nrEchipe = nrEchipe;
        } else {
            System.out.println("Nu poti introduce un numar de echipe mai mare decat numarul membrilor curenti");
        }
    }

    @Override
    public void addMember(Member m) {
        if (this.getMembrii().size() < 15) {
            this.getMembrii().add(m);
        } else {
            System.out.println("Nu mai poti adauga membrii, limita maxima a fost atinsa");
        }
    }


    @Override
    public double getRisk() {

        return (nrEchipe * 3.00 /
                this.getMembrii().size()
                / (getFonduri() - fonduriMarketing));
    }

}
