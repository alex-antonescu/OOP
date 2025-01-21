public class Sertar {
    private double latime;
    private double lungime;
    private double inaltime;

    public Sertar(double latime, double lungime, double inaltime)
    {
        this.latime = latime;
        this.lungime = lungime;
        this.inaltime = inaltime;
    }

    public void showInfo(){
        System.out.println("Sertar " + "Latime " + latime +"Lungime" + lungime + "Inaltime" + inaltime);
    }
}
