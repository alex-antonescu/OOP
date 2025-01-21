public class Main {
    public static void main(String[] args) {
        try {
            C c = new C();
            c.oMetoda();
        }
        catch(Exceptie1 e1) {
            System.out.println("Exceptie1");
        }
        catch(Exceptie2 e2) {
            System.out.println("Exceptie2");
        }
        catch(Exceptie3 e3) {
            System.out.println("Exceptie3");
        }
    }
}
