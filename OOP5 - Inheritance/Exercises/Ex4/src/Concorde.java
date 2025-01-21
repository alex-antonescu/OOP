public class Concorde extends Avion {
    private int maxPassenger;

    public Concorde(String planeID, int totalEnginePower, int maxPassenger) {
        super(planeID, totalEnginePower);
        this.maxPassenger = maxPassenger;
    }

    public int getMaxPassenger() {
        return maxPassenger;
    }

    public void goSuperSonic(){
        System.out.println("PlaneID: " + getPlaneID() +
                " - Supersonic mode activated");
    }

    public void goSubSonic(){
        System.out.println("PlaneID: " + getPlaneID() +
                " - Supersonic mode deactivated");
    }
}
