public class Main {
    public static void main(String[] args) {
        //Instantiere si initializare persoane
        Persoana p1 = new Persoana("A",23);
        Persoana p2 = new Persoana("B",23);
        Persoana p3 = new Persoana("C",26);

        //Popularea listei de persoane
        Persoana.addPersoana(p1);
        Persoana.addPersoana(p2);
        Persoana.addPersoana(p3);

        Persoana.showPersoane();
    }
}
