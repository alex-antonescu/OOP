public class Procesor implements Runnable{
    private Memorie memorie;

    public Procesor(Memorie memorie) {
        this.memorie = memorie;
    }

    @Override
    public void run() {
        int i = 1;
        while(i<=10){
            i++;
            memorie.store(String.valueOf(i));
        }
    }
}
