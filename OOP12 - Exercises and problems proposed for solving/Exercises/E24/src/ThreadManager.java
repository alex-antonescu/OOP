import java.util.HashMap;
import java.util.Map;

public class ThreadManager {
    private Map<String,Thread> map = new HashMap<>();

    public void register(Thread t, String threadName){
        map.put(threadName,t);
        System.out.println(t.getName()+" was registered "+" as "+threadName);
    }
    public void startThread(String threadName){
        map.get(threadName).start();
    }


}
