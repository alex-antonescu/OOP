package elemente;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Stiva {
    private int dimensiuneStiva;
    private List<Punct> listaElemente;

    public Stiva() {
        listaElemente = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Care este dimensiunea stivei?: ");
        int dimensiune = scanner.nextInt();
        try{
        if (dimensiune < 0) {
            throw new RuntimeException();
        }
        this.dimensiuneStiva = dimensiune;
        } catch (RuntimeException e) {
            System.out.println("Numarul nu poate fi negativ");
        }
    }

    public List<Punct> getListaElemente() {
        return listaElemente;
    }

    public void introducereElement(Punct figura) throws Exception {
        try {
            if (listaElemente.size() > dimensiuneStiva - 1) {
                throw new RuntimeException();
            }
            for (Punct element : listaElemente) {
                if (figura.equals(element)) {
                    throw new Exception();
                }
            }

            listaElemente.add(figura);
        } catch (RuntimeException r) {
            System.out.println("elemente.Stiva este plina!");
        } catch (Exception e) {
            System.out.println("Elementul: " + figura + " este deja stocat!");

        }
    }

    public Punct returnareStergereUltimElement() throws Exception{
        try{
            if(listaElemente.isEmpty()){
                throw new Exception();
            }
            Punct ultimul = listaElemente.getLast();
            listaElemente.remove(ultimul);
            System.out.println(ultimul.toString());
            return ultimul;

        }catch (Exception e){
            System.out.println("elemente.Stiva este goala");
            return null;
        }
    }

    public List<Punct> afisareElementeStiva(){
        List<Punct> elemente = new ArrayList<>();
        for(int i = listaElemente.size()-1; i>=0; i--){
            System.out.println(listaElemente.get(i));
            elemente.add(listaElemente.get(i));
        }
        return listaElemente;
    }



}
