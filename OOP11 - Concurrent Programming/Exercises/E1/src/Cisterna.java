public class Cisterna extends Thread{

    private int capacitateCisterna;
    private Benzinarie benzinarie = new Benzinarie();


    public Cisterna(int capacitateCisterna) {
        try {
            if (1000 < capacitateCisterna)
                throw new RuntimeException();
            this.capacitateCisterna = capacitateCisterna;
        } catch (RuntimeException r) {
            System.out.println("Capacitate indisponibila, seteaza alta capacitate!");
        }
    }

    public void run(){
        while (true) {
            try {
                benzinarie.introducereCombustibilBenzinarie(capacitateCisterna);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
