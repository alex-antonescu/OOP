public class ProiectMilitar extends Proiect {
    private String deadLine;
    private String parola;

    public ProiectMilitar(String titlu, String obiectiv, Manager manager, long fonduri, String deadLine, String parola) {
        super(titlu, obiectiv, manager, fonduri);
        this.deadLine = deadLine;
        this.parola = parola;
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
        return this.getMembrii().size() /
                parola.length() / this.getFonduri();
    }

}
