public class Main {
    public static void main(String[] args) {
        //Generarea anagjatilor
        AngajatCuOra angajat1 = new AngajatCuOra("Alex",1000);
        AngajatCuSalarFix angajat2 = new AngajatCuSalarFix("Denis",1000);


        //Generare & populare firma
        Firma IT = new Firma();
        IT.adaugareAngajat(angajat1);
        IT.adaugareAngajat(angajat2);


        //Testarea metodelor si a cazurilor limita
        IT.adaugareAngajat(angajat2);
        angajat1.adaugaOre(5);
        angajat1.setSalariuPeOra(20000);
        System.out.println(IT.calculSalariuMediu());
    }
}
