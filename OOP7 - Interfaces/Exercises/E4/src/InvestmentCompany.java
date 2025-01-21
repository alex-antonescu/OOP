import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class InvestmentCompany {
    public static void main(String[] args) {

        //Generare Manager
        Manager m1 = new Manager(25,"Alex");
        Manager m2 = new Manager(25, "Denis");
        Manager m3 = new Manager(18, "Tu");

        //Generarea Membrilor
        Member p1 = new Member(22,"Gica");
        Member p2 = new Member(24,"Ion");
        Member p3 = new Member(29,"Ionel");
        Member p4 = new Member(29,"Ionut");
        Member p5 = new Member(29,"Ionut");

        //Generarea Proiectelor
         ProiectComercial pro1 = new ProiectComercial("BookShop","Platforma online", m1, 1,"Maine");
         ProiectMilitar pro2 = new ProiectMilitar("UAV Security","Urmarirea cu drone",m2,100,"Poimaine", "P");
         ProiectOpenSource pro3 = new ProiectOpenSource("Music","Cele mai bune melodii jazz",m2,3,"lista1");


         //Adaugarea membrilor si definirea nr de echipe in primul proiect
        pro1.addMember(p1);
        pro1.addMember(p2);
        pro1.addMember(p3);
        pro1.addMember(p4);
        pro1.addMember(p5);
        pro1.setNrEchipe(2);

        pro2.addMember(p1);
        pro2.addMember(p2);
        pro2.addMember(p3);
        pro2.addMember(p4);
        pro2.addMember(p5);

        pro3.addMember(p1);
        pro3.addMember(p3);
        pro3.addMember(p4);
        pro3.addMember(p5);

        //Introducerea proiectelor in baza de date wannabe
        InvestmentCompany.addProject(pro1);
        InvestmentCompany.addProject(pro2);
        InvestmentCompany.addProject(pro3);

        //Cea mai buna investitie
        InvestmentCompany.getBestInvestment();

    }
    private static List<Proiect> lista = new ArrayList<>();

    public static void addProject(Proiect p){
        lista.add(p);
    }

    public static Proiect getBestInvestment(){
        double best = lista.getFirst().getRisk();
        Proiect bestProiect = new Proiect();
        for(Proiect p : lista){
            if(p.getRisk() < best) {
                best = p.getRisk();
                bestProiect = p;
            }
        }
        System.out.println(bestProiect);
        return bestProiect;
    }
}

