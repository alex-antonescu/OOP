import java.util.LinkedList;

public class Casierita extends Thread {
    private static LinkedList<String> bonuri;
    private int nrBonuri = 0;

    public void run(){
        while(true){
            try{

            }catch ();
        }
    }

    public void generateBon(Agent a) throws InterruptedException {
        while(nrBonuri>20){
            wait();
        }
        a.vanzare();
        nrBonuri++;
    }

    public void 



}