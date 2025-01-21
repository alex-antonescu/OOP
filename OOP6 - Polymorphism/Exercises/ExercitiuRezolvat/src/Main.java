//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Pluton pluton1,
                pluton2,
                pluton3;

        pluton1 = new Pluton();
        pluton1.adauga(new Arcas());
        pluton1.adauga(new Arcas());
        pluton1.adauga(new Arcas());
        pluton1.adauga(new Arcas());

        pluton3 = new Pluton();
        pluton3.adauga(new Arcas());
        pluton3.adauga(new Arcas());
        pluton2 = new Pluton();
        pluton2.adauga(new Calaret());
        pluton2.adauga(pluton3);

        boolean loveste_primul = (Math.random() > 0.5);
        while(pluton1.esteVie() && pluton2.esteVie()) {
            if(loveste_primul) {
                System.out.println("Loveste Pluton1");
                pluton1.loveste(pluton2);
            } else {
                System.out.println("Loveste Pluton2");
                pluton2.loveste(pluton1);
            }
            loveste_primul = !loveste_primul;
        }
        System.out.println("Pluton1 este viu:" + pluton1.esteVie());
        System.out.println("Pluton2 este viu:" + pluton2.esteVie());
        System.out.println("A castigat:" + (pluton1.esteVie() ? "pluton1" :
                pluton2.esteVie() ? "pluton2" : "nimeni"));
        System.out.println("Numar cai decedati:" + Calaret.getNrCaiPierduti());
    }
}