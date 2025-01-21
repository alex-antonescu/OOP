//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Creare cont bancar
        ContBancar cont1 = new ContBancarLei(1000,"RO1234");
        ContBancar cont2 = new ContBancarEuro(2000,"EUR9999");

        //Creare client
        Client c1 = new Client("Alex","Timisoara",cont1);
        c1.addCont(cont2);

        //Creare banca
        Banca banca = new Banca("BRD");
        banca.add(c1);
        banca.afisareClient(c1.getNume());
    }
}