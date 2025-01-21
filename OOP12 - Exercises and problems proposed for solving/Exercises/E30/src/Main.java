public class Main {
    public static void main(String[] args) {
        //Generare produs
        Depozit depozit = new Depozit();

        //Generare produselor;
        Produs p1 = new Produs("banane", 5,3,false,1);
        Produs p2 = new Produs("clementine", 10,7,true,0.85);
        Produs p3 = new Produs("apa", 13,1,false,0.85);
        Produs p4 = new Produs("ciocolata", 17,13,true,0.5);

        //Populare depozit
        depozit.adaugareProdus(p1,7);
        depozit.adaugareProdus(p2,5);
        depozit.adaugareProdus(p3,2);
        depozit.adaugareProdus(p4,10);
        depozit.adaugareProdus(p4,10);
        depozit.adaugareProdus(new Produs("cereale",5,3,true,0.11),3);
        //depozit.adaugareProdus(new Produs("cereale",5,1,true,0.11),1); -- pt acelasi nume - String egale, devin un singur obiect

        //Testare metode
        p1.calculeazaPret();
        p2.calculeazaPret();
        depozit.afisareProduseDepozit();
    }
}
