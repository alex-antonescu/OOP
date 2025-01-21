//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Siruri sir = new Siruri();

        sir.startPopulare();
        sir.deleteDuplicate();
        System.out.println(sir.getListaOriginala().toString());
        System.out.println(sir.getListaFaraElementeDuplicate().toString());
    }
}