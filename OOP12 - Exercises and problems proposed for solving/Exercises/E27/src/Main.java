public class Main {
    public static void main(String[] args) throws InterruptedException {
        Memorie m = new Memorie();

        Thread s = new Thread(new Scriitor(m));
        Thread p1 = new Thread(new Procesor(m));
        Thread p2 = new Thread(new Procesor(m));
        Thread p3 = new Thread(new Procesor(m));
        Thread p4 = new Thread(new Procesor(m));

        s.start();
        p1.start();
        p2.start();
        p3.start();
        p4.start();

        s.join();
        p1.join();
        p2.join();
        p3.join();
        p4.join();
        System.out.println("Process finished!");
    }
}
