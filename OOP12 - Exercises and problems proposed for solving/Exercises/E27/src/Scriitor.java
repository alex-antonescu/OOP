public class Scriitor implements Runnable{
    private Memorie memorie;

    public Scriitor(Memorie memorie) {
        this.memorie = memorie;
    }

    @Override
    public void run() {
        int i = 1;
        while(i<=40){
            memorie.discard();
            System.out.println("Discarded!");
            i++;
        }
    }
}
