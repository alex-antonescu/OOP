public class Utilitar {
    private static boolean notFound = false;
    public static boolean elementLipsa() {
        return notFound;
    }

    public static double medie(double x, SirNumereReale sir) {
        double medie = sir.extragereDupa(x);
        notFound = false;
        if(sir.testExceptie()) {
            if(medie == -1) {
                notFound = true;
                return 0; //desi nu inseamna nimic
            } else {
                notFound = false;
                return 0;
            }
        }
        for(int i = 1; i < 10; i++) {
            double tmp = sir.extragereDupa(x);
            if(!sir.testExceptie()) {
                medie+= tmp;
            } else {
                medie = 0;
                break;
            }
        }
        return medie / 10;
    }
}
