public class Main {
    public static void main(String[] args) {
        ThreadManager m = new ThreadManager();

        Thread t1 = new ThreadGenerator("Programatorule");
        Thread t2 = new ThreadGenerator("Aerospatial");

        m.register(t1, "ThreadOne");
        m.register(t2, "ThreadTwo");

        m.startThread("ThreadOne");
        m.startThread("ThreadTwo");
    }
}
