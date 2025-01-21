//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Creare contribuabil
        Contribuabil c1 = new Contribuabil("Ion","Popescu","188053020038");

        //Adaugare proprietati
        Teren T1 = new Teren("Svinita",1,1000,1);
        Cladire C1  = new Cladire("Timisoara", 99,200);
        Cladire C2 = new Cladire("Nordis",30,1000);

        //Atribuire proprietati catre contribuabil
        c1.adaugareProprietate(C1);
        c1.adaugareProprietate(T1);
        c1.adaugareProprietate(C2);

        c1.afisareProprietatiSiTaxe();






        }
    }