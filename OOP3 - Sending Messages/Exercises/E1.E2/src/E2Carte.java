public class E2Carte {
    private int pages;

    public E2Carte(int pages) {
        this.pages = pages;
    }

    public static void compareBooks(E2Carte b1, E2Carte b2) {
        if (b1.pages == b2.pages) {
            System.out.println("2 carti cu acelasi numar de pagini");
        } else System.out.println("UUUps, avem 2 carti care nu au acelasi numar de pagini.");
    }
}
