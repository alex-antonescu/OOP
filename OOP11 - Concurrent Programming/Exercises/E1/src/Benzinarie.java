public class Benzinarie {
    private  static int cantitate = 0;
    private final int cantiteMaxima =1000;



    public synchronized void introducereCombustibilBenzinarie(int litri) throws InterruptedException {
        while(cantitate+litri>cantiteMaxima){
            wait();
        }
        cantitate+=litri;
        System.out.println("Benzinaria a fost alimentata cu " +litri+" Cantitatea actuala: " + cantitate);
        notifyAll();
    }

    public synchronized void extragereCombustibilBenzinarie(int litri) throws InterruptedException {
        while(cantitate-litri<0){
            wait();
        }
        cantitate-=litri;
        System.out.println("Din benzinarie s-au extras " +litri+" Cantitatea actuala: " + cantitate);
        notifyAll();

    }
}
