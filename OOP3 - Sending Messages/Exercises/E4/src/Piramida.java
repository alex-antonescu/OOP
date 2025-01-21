public class Piramida {
    private int n;

    public Piramida(int n) {
        this.n = n;
    }

    public void piramidaShow() {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}

