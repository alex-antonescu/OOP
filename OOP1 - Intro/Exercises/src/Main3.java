public class Main3 {
    public static void main(String[] args) {
        int s = 0;

        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            } else {
                s = s + i;
            }
        }
        System.out.println(s);
    }
}
