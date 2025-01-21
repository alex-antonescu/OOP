public class ThreadGenerator extends Thread{
    private String mesaj;

    public ThreadGenerator(String mesaj) {
        this.mesaj = mesaj;
    }

    public void run(){
        int i = 0;
        while (i<=10){
            i++;
            System.out.println("Saluuutare, " + mesaj);
        }
    }
}
