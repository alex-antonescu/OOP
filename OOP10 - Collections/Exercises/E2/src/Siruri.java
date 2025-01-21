import java.util.LinkedList;
import java.util.Scanner;

public class Siruri {
    private LinkedList<String> listaOriginala;
    private LinkedList<String> listaFaraElementeDuplicate;

    public Siruri() {
        this.listaOriginala = new LinkedList<>();
        this.listaFaraElementeDuplicate = new LinkedList<>();
    }

    public LinkedList<String> getListaOriginala() {
        return listaOriginala;
    }

    public LinkedList<String> getListaFaraElementeDuplicate() {
        return listaFaraElementeDuplicate;
    }

    public void startPopulare(){
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;
        while(isRunning){
            System.out.println("Introdu un element in lista!");
            String element = scanner.nextLine();
            if(element.equals("STOP")){
                isRunning = false;
                System.out.println("Proces finalizat!");
                break;
            }
            listaOriginala.add(element);
        }
        scanner.close();
    }

    public void deleteDuplicate(){
        for(String s1 : listaOriginala){
            if(!listaFaraElementeDuplicate.contains(s1)){
                listaFaraElementeDuplicate.add(s1);
            }
        }
    }


//    public void show(LinkedList<String> lista){
//        for(String s : lista){
//            System.out.println(s);
//        }
//    }
}
