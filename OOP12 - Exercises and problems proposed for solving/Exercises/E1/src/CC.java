public class CC {
    private static int counter;

    public CC() {
        counter++;
    }

    public static int getCounter() {
        System.out.println("Nr instante generate: " + counter);
        return counter;
    }
}
