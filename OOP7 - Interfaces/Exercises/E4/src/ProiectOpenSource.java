public class ProiectOpenSource extends Proiect{
    private String mailingList;

    public ProiectOpenSource(String titlu, String obiectiv, Manager manager, long fonduri, String mailingList) {
        super(titlu, obiectiv, manager, fonduri);
        this.mailingList = mailingList;
    }

    @Override
    public double getRisk(){
        return (this.getMembrii().size()/this.getFonduri());
    }
}
