import java.util.Arrays;

public class Firma {
    private Angajat[] angajati;
    private int companySize;

    public Firma() {
        this.angajati = new Angajat[1024];
        this.companySize = 0;
    }

    public boolean cautareAngajat(Angajat angajatCautat){
        boolean isFound = false;
        var angajati = Arrays.copyOf(this.angajati,companySize);
        for(var angajat : angajati){
            if(angajat.equals(angajatCautat)){
                isFound = true;
            }
        }
        return isFound;
    }

    public int adaugareAngajat(Angajat angajat){
        if(cautareAngajat(angajat)){
            System.out.println("Nemodificat - angajatul exista deja!");
            return -2;
        }

        for(int i = 0; i<=companySize; i++){
            if(angajati[i] == null){
                angajati[i] = angajat;
                companySize++;
                return 0;
            }
        }
        return -1;
    }

    public double calculSalariuMediu(){
        double suma = 0;
        var angajati = Arrays.copyOf(this.angajati,companySize);
        for(var angajat : angajati){
            suma += angajat.calculSalar();
        }
        if(suma==0) return 0;
        return suma/companySize;
    }

}
