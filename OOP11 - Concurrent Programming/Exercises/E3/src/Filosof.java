public class Filosof extends Thread {
    private String name;
    private Furculita furculita1;
    private Furculita furculita2;

    public Filosof(String name, Furculita furculita1, Furculita furculita2) {
        this.name = name;
        this.furculita1 = furculita1;
        this.furculita2 = furculita2;
    }

    public void run(){
        while (true){
            think();

            synchronized (furculita1){
                furculita1.utilizare();
            }
            synchronized (furculita2){
                furculita2.utilizare();
            }
            eat();
        }
    }

    public void eat(){
        System.out.println(this.name + " eating");
    }

    public  void think(){
        System.out.println(this.name + " thinking");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println(this.name + "stopped thinking");
        }
    }


}
