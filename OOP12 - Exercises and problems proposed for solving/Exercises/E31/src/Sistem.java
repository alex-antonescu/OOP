import java.util.*;

public class Sistem implements Comparable<String> {
    private List<Fisier> fisiere;

    public Sistem() {
        this.fisiere = new ArrayList<>();
    }

    public int getNumberOfFiles(){
        return fisiere.size();
    }

    public int getNumberOfClasses(){
        int nrClase = 0;
        for(Fisier f : fisiere){
            nrClase += f.getNumberOfClasses();
        }
        return nrClase;
    }

    public Set<String> getNumberOfAuthors(){
        Set<String> autori = new HashSet<>();
        for(Fisier f : fisiere){
            autori.add(f.getAutor());
        }
        //System.out.println(autori.size());
        return autori;
    }

    public void addFisier(Fisier fisier){
        fisiere.add(fisier);
    }

    public void infoSistem(){
        System.out.println("Nr. fisiere existente: " + getNumberOfFiles());
        System.out.println();

        var autori = getNumberOfAuthors();
        for(var autor : autori){
            System.out.println(autor+":");
            for(var fisier :fisiere){
                if(autor.equalsIgnoreCase(fisier.getAutor())){
                    System.out.println(" ".repeat(2)+fisier);
                    //fileByAuthors.add(fisier);
                }
            }
            //map.put(autor,fileByAuthors);
        }
    }

    @Override
    public int compareTo(String o) {
        return 0;
    }
}
