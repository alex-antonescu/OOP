public class Main {
    public static void main(String[] args) {
        Thread t1 = new FirExecutiThread();
        Thread t2 = new Thread(new FirExecutieRunnable());

        //t1.start();
        t2.start();
    }
}
