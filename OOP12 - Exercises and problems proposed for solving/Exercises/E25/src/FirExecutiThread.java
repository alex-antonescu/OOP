public class FirExecutiThread extends Thread{
    public void run(){
        int i = 1;
        while (i<=99){
            System.out.println(i);
            i++;
        }
    }
}
