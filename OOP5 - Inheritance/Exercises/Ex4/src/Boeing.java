public class Boeing extends Avion {
    private int maxPassenger;

    public Boeing(String planeID, int totalEnginePower, int maxPassenger) {
        super(planeID, totalEnginePower);
        this.maxPassenger = maxPassenger;
    }

    public int getMaxPassenger() {
        return maxPassenger;
    }
}
