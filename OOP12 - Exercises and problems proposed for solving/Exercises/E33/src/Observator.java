import java.util.LinkedList;
import java.util.List;

public class Observator {
    private static List<Figura> figuri = new LinkedList<>();


    public void addFigura(Figura figura){
        figuri.add(figura);
    }

    public void showFiguri(){
        for(var figura : figuri){
            System.out.println(figura);
        }
    }

    public void notifyChange(){
        System.out.println("Update!");
        showFiguri();
    }
}
