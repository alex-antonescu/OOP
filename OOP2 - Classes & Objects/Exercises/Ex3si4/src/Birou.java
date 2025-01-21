public class Birou {

    private final int nrSertare = 2;
    private double latime;
    private double lungime;
    private double inaltime;

    public Birou(double latime, double lungime, double inaltime)
    {
        this.latime = latime;
        this.lungime = lungime;
        this.inaltime = inaltime;
    }

    public void InfoBirou(){
        System.out.println("Biroul are: " + nrSertare + "Latime " + latime +"Lungime" + lungime + "Inaltime" + inaltime);
    }

}
