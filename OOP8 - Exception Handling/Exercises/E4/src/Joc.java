import java.util.Scanner;

public class Joc {
    private String echipa1;
    private String echipa2;
    private  int goluriEchipa1;
    private  int goluriEchipa2;
    private  int outTotal;
    private  int cornerTotal;
    private  Minge mingeCurenta;

    public Joc() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Numele echipe: ");
        echipa1 = scanner.nextLine();
        System.out.print("Numele adversarilor: ");
        echipa2 = scanner.nextLine();
        mingeCurenta = new Minge();
    }

    public String getEchipa1() {
        return echipa1;
    }

    public void setEchipa1(String echipa1) {
        this.echipa1 = echipa1;
    }

    public String getEchipa2() {
        return echipa2;
    }

    public void setEchipa2(String echipa2) {
        this.echipa2 = echipa2;
    }

    public  int getGoluriEchipa1() {
        return goluriEchipa1;
    }

    public  void setGoluriEchipa1(int goluriEchipa1) {
        this.goluriEchipa1 = goluriEchipa1;
    }

    public  int getGoluriEchipa2() {
        return goluriEchipa2;
    }

    public  void setGoluriEchipa2(int goluriEchipa2) {
        this.goluriEchipa2 = goluriEchipa2;
    }

    public  int getOutTotal() {
        return outTotal;
    }

    public  void setOutTotal(int outTotal) {
        this.outTotal = outTotal;
    }

    public  int getCornerTotal() {
        return cornerTotal;
    }

    public  void setCornerTotal(int cornerTotal) {
        this.cornerTotal = cornerTotal;
    }

    @Override
    public String toString() {
        return "Joc \n" +
                "E1: " + getEchipa1() + "\n" +
                "E2: " + getEchipa2() + "\n" +
                "Scor: " + getGoluriEchipa1() + ":" + getGoluriEchipa2() + "\n" +
                "OutTotal " + getOutTotal() + "\n" +
                "Corner " + getCornerTotal() + "\n";
    }

    public void simuleaza() throws Corner, Gol, Out {
        Minge m = new Minge();
        int nrSuturi = 0;
        while (nrSuturi < 1000) {
            try {
                m.suteaza();
            } catch (Out o) {
                this.outTotal++;
                Minge mingeSecundara = new Minge();
                mingeSecundara.setX(m.getX());
                mingeSecundara.setY(m.getY());
                System.out.println("Out");
                mingeCurenta = mingeSecundara;
            } catch (Gol g) {
                if (mingeCurenta.getX() == 0) {
                    this.goluriEchipa2++;
                    System.out.println("Goooool " + echipa2);
                }
                this.goluriEchipa1++;
                System.out.println("Goooool " + echipa1);
                mingeCurenta = new Minge();
            } catch (Corner c) {
                this.cornerTotal++;
                if (mingeCurenta.getX() == 0 &&
                        (0 < mingeCurenta.getY() && mingeCurenta.getY() < 20)) {
                    mingeCurenta = new Minge(0, 0);
                }
                if (mingeCurenta.getX() == 0 &&
                        (30 < mingeCurenta.getY() && mingeCurenta.getY() < 50)) {
                    mingeCurenta = new Minge(0, 50);
                }
                if (mingeCurenta.getX() == 100 &&
                        (0 < mingeCurenta.getY() && mingeCurenta.getY() < 20)) {
                    mingeCurenta = new Minge(100, 0);
                }
                if (mingeCurenta.getX() == 100 &&
                        (30 < mingeCurenta.getY() && mingeCurenta.getY() < 50)) {
                    mingeCurenta = new Minge(100, 50);
                }
                System.out.println("Corner");
            }
            nrSuturi++;
        }
    }
}
