import java.util.Random;

public class Agent extends Thread{
    private String nume;
    private Random random = new Random();

    public Agent(String nume) {
        this.nume = nume;
    }

    public synchronized void vanzare() {
        double suprafata = random.nextDouble(100);
        double pret = suprafata * 25.00;
        System.out.println(nume + " - " + suprafata + " - " + pret);
    }

}
