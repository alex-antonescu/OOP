public class Vehicul implements FunctiiVehicul{
    @Override
    public void drive(){
        System.out.println("The vehicle started");
    }

    @Override
    public void reverse(){
        System.out.println("The vehicle stopped");
    }

}
