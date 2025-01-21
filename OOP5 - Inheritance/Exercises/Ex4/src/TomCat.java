public class TomCat extends Avion {

    public TomCat(String planeID, int totalEnginePower) {
        super(planeID, totalEnginePower);
    }

    public void launchMissile(){
        System.out.println("PlaneID: " + getPlaneID() +
                "- Initiating missile launch procedure - Acquiring target - " +
                "Launching missile - Breaking away - Missile launch complete");
    }

    public void refuel(){
        System.out.println("PlaneID: " + getPlaneID() + " - Initiating refueling procedure - " +
                "Locating refueller - Catching up - Refueling - Refueling complete");
    }
}
