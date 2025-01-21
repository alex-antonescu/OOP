//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Avion a1 = new Boeing("YR-125",1000,150);
        Avion a2 = new Concorde("YR-115",1500,100);
        Avion a3 = new Mig("YR-999",3000);
        Avion a4 = new TomCat("YR-111",3500);

        Concorde a5 = new Concorde("YR-111",1111,100);

        a1.fly();
        System.out.println();
        a2.land();
        System.out.println();
        ((Concorde) a2).goSuperSonic();
        System.out.println();
        ((Concorde) a2).goSubSonic();
        System.out.println();
        a3.takeOff();
        System.out.println();
        ((TomCat)a4).launchMissile();
        System.out.println();
        ((TomCat)a4).refuel();
        System.out.println();
        }
    }