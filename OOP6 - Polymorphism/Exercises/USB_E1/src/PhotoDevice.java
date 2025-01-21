public class PhotoDevice extends Device {
    public PhotoDevice(String information) {
        super(information);
    }

    public void takePicture() {
        System.out.println("TakePicture...");
        //this.store(picture);
    }
    public void showConnection(){
        System.out.println("PC --> PhotoDevice ");
    }
}
