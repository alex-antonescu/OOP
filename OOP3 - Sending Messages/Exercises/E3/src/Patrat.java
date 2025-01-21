public class Patrat {

    private int latura;

    public Patrat(){
        latura = 10;
    }

    public Patrat(int latura){
        this.latura=latura;
    }

    public  void datePatrat(){
        System.out.println("Patrat "+ latura + " Aria " + latura*latura);
    }

}
