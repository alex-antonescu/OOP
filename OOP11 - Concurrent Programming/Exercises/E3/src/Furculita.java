public class Furculita {
    private String furculita;

    public Furculita(String furculita) {
        this.furculita = furculita;
    }

    public synchronized void utilizare(){
        System.out.println(this.furculita + " Is being used");
    }
}
