import java.io.*;

public class Intervale {

    //private Double[] limits;
    private Double limitaInf;
    private Double limitaSup;
    private BufferedReader br;
  //  private citirefisier selectareFisier;
    private static String numeFisier = "x.txt";
    private static int numereTestate;
    private static int numereTestateAcceptate;




    public Intervale(String numeFisier) {
        numereTestate = 0;
        numereTestateAcceptate = 0;
        //selectareFisier = new citirefisier();
        //limits = new Double[2];
        Intervale.numeFisier = numeFisier;
        //System.out.println("Fisierul a fost selectat");

    }




    public BufferedReader start(){
        try {
            br =
                    new BufferedReader
                            (new InputStreamReader
                                    (new FileInputStream(numeFisier)));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return br;
    }

    public Double[] setLimits(){

        try {
            String line = br.readLine();
            if(line != null){
                String[] split = line.trim().split(",");
                if(split.length == 2){
                    limitaInf = Double.parseDouble(split[0]);
                    limitaSup = Double.parseDouble(split[1]);
                } else {
                    System.out.println("Linia nu respecta caracteristicile");
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return new Double[]{limitaInf, limitaSup};
    }




//
//    public boolean testare() {
//
//        //selectareFisier.start();
//        boolean pass = false;
//        Double[] perche = setLimits();
//        numereTestate++;
//
//
//
////       // if(perche[0]<) {
////            System.out.println("Accepted");
////            numereTestateAcceptate++;
////            pass = true;
////        }
////        System.out.println("Not accepted");
////        return pass;
//    }

    public void printare(){
        System.out.println(numereTestateAcceptate/numereTestate*100);
    }




}