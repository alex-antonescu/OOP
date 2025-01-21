public class Avion {
    private String planeID;
    private int totalEnginePower;

    public Avion(String planeID, int totalEnginePower) {
        this.planeID = planeID;
        this.totalEnginePower = totalEnginePower;
    }

    public String getPlaneID() {
        return planeID;
    }

    public int getTotalEnginePower() {
        return totalEnginePower;
    }

    public void takeOff() {
        System.out.println("PlaneID: " + getPlaneID() +
                " - Initiating takeoff procedure" +
                " - Starting engines - Accelerating down the runway - " +
                "Taking off - Retracting gear - Takeoff complete”");
    }

    public void fly(){
        System.out.println("PlaneID: " + getPlaneID() + " - Flying");
    }

    public void land(){
        System.out.println("PlaneID: " +getPlaneID() + " - Initiating landing procedure - " +
                "Enabling airbrakes Lowering gear - " +
                "Contacting runway - Decelerating - Stopping engines - Landing complete");
    }
}
