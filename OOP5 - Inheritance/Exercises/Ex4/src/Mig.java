public class Mig extends Avion {

    public Mig(String planeID, int totalEnginePower) {
        super(planeID, totalEnginePower);
    }

    public void launchMissile(){
        System.out.println("PlaneID:" + getPlaneID() +
                "- Initiating missile launch procedure - Acquiring target - " +
                "Launching missile - Breaking away - Missile launch complete");
    }

    public void highSpeedGeometry(){
        System.out.println("PlaneID: " + getPlaneID() + "High speed geometry selected");

    }

    public void normalGeometry(){
        System.out.println("PlaneID: " + getPlaneID() + "Normal geometry selected");
    }


}
