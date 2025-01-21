public abstract class Figura {
    protected Observator observator = new Observator();
    private String tip;
    private String culoare;

    public Figura(String tip, String culoare) {
        this.tip = tip;
        this.culoare = culoare;
    }


    public void setCuloare(String culoare) {
        this.culoare = culoare;
        observator.notifyChange();
    }

    public abstract double calculPerimetru();

    public boolean egalitate(Figura figura){
        boolean equals = false;
        if(this.tip.equals(figura.tip)){
            if (this.calculPerimetru() == figura.calculPerimetru()){
                equals = true;
            }
        }
        return equals;
    }

    @Override
    public String toString() {
        return "Tip figura: " + tip +", culoare: " + culoare + ", perimetru: " +calculPerimetru();
    }

    @Override
    public int hashCode() {
        return tip.hashCode();
    }
}
