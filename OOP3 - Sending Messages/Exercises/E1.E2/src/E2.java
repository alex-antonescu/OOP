import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
        //O carte este caracterizat˘a printr-un num˘ar de pagini. Spunem c˘a dou˘a c˘art¸i sunt
        //identice dac˘a acestea au acela¸si num˘ar de pagini. Creat¸i clasa Carte ¸si ata¸sat¸i-i o
        //metod˘a potrivit˘a pentru compararea a dou˘a c˘art¸i. Apelat¸i metoda care realizeaz˘a
        //compararea a dou˘a c˘art¸i ˆıntr-o metod˘a main.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Cate pagini are prima carte?");
        int nrPaginiPrima = scanner.nextInt();
        E2Carte carte1 = new E2Carte(nrPaginiPrima);

        System.out.println("Cate pagini are prima carte?");
        int nrPaginiDoua = scanner.nextInt();
        E2Carte carte2 = new E2Carte(nrPaginiDoua);

        E2Carte.compareBooks(carte1, carte2);


    }

}
