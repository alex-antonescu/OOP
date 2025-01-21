public class Main {
    public static void main(String[] args) {

        //Generarea obiectelor (coada; card; strategii)
        Wrapper w = new Wrapper();
        Wrapper.Coada c = new Wrapper.Coada(3);
        Card maestro = new Maestro("Alex","1234567887654321","999");
        Card visa = new Visa("Denis","1234559997654321","999");
        Card masterCard = new MasterCard("Antonescu","1234567887654321");
        Strategie s1 = new StrategiePeUtilizator("Aleeex");
        Strategie s2 = new StrategiePe555(visa);




        //Testare metode
        //Add
        c.addCard(visa);
        c.addCard(maestro);
        c.addCard(masterCard);
        //Delete
        //c.returnDeleteCard();
        //Print
        //c.showContent();
        //System.out.println(c.esteInCoada(s1));
        System.out.println(c.esteInCoada(s2));
    }
}
