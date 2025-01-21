import java.util.Random;

public class Autoturism extends Thread {
    private int capacitateAutoturism;
    private Benzinarie benzinarie = new Benzinarie();


    public Autoturism(int capacitateAutoturism) {
        try {
            if (1 > capacitateAutoturism || 1000 < capacitateAutoturism)
                throw new RuntimeException();
            this.capacitateAutoturism = capacitateAutoturism;

        } catch (RuntimeException r) {
            System.out.println("Capacitate indisponibila, seteaza alta capacitate!");
        }
    }

    public void run(){
        while (true){
            try{
                benzinarie.extragereCombustibilBenzinarie(extrageCombustibil());
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

    }

    public int extrageCombustibil() {
        Random random = new Random();
        int cantitate = 0;
        if (capacitateAutoturism == 1) {
            cantitate = 1;
        } else {
            cantitate = random.nextInt(capacitateAutoturism + 1);
        }
        System.out.println(cantitate);
        return cantitate;
    }
}
