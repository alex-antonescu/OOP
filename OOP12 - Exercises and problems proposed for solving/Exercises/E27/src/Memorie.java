public class Memorie {
    private String sir;
    private boolean isFull = false;

    public synchronized void store(String sir){
        while (isFull){
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Fir intrerupt" + e.getMessage());;
            }
        }
        System.out.println(sir);
        this.sir = sir;
        isFull = true;
        notifyAll();
    }

    public synchronized void discard(){
        while(!isFull){
            try {
                wait();
            } catch (InterruptedException e){
                System.out.println("Fir intrerurpt: " + e.getMessage());
            }
        }
        this.sir = "";
        isFull = false;
        notifyAll();
    }
}
