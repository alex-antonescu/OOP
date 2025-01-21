import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Persoana {
    private String nume;
    private String CNP;
//    private static Set<Persoana> set1 = new HashSet<>();
//    private static Set<Persoana> set2 = new HashSet<>();

    public Persoana(String nume, String CNP) {
        this.nume = nume;
        this.CNP = CNP;
    }


    public static Set<Persoana> intersectie(Set<Persoana> s1, Set<Persoana> s2){
        Set<Persoana> persoaneComuneSeturi = new HashSet<>();
        for(var persoana1 : s1){
            if(s2.contains(persoana1)){
                persoaneComuneSeturi.add(persoana1);
            }
        }
        return persoaneComuneSeturi;
    }


    @Override
    public String toString() {
        return "Nume: " + nume + ", CNP: " + CNP;
    }
}
