public class Client {
    public static void test(NumarComplex x) {
        if(x instanceof NumarReal)
            System.out.println("Real");
        else
            System.out.println("Complex");
    }
}
