import java.util.ArrayList;
import java.util.List;

public class BlockTask extends Task{

    private List<Task> taskuri;

    public BlockTask() {
        this.taskuri = new ArrayList<>();
    }

    public void insertTask(Task t){
        taskuri.add(t);
        t.inclusionTCompus++;
    }

    @Override
    public int executeMs() {
        int totalExecutionTime = 0;
        for(Task t : taskuri){
            totalExecutionTime += t.executeMs();
        }
        return totalExecutionTime;
    }

    @Override
    public String taskName() {
        StringBuilder name = new StringBuilder();
        name.append("BlockTask(");
        for(Task t : taskuri){
            name.append(t.taskName());
            name.append(",");
        }
        name.deleteCharAt(name.length()-1);
        name.append(")");
        return name.toString();
    }
}
