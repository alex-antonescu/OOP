public class VideoDevice extends Device {
    private String producer;

    public VideoDevice(String information, String producer) {
        super(information);
        this.producer = producer;
    }

    public void film(){
        System.out.println("Film...");
        //this.store(Film);
    }

    public void showConnection(){
        System.out.println("PC --> VideoDevice ");
    }

    @Override
    public String load(){
        return producer + " " + super.load();
    }
}
