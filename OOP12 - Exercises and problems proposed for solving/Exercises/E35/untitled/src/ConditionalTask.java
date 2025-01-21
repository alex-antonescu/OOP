import java.util.Random;

public class ConditionalTask extends Task {
    private Task task1;
    private Task task2;

    public ConditionalTask(Task task1, Task task2) {
        this.task1 = task1;
        this.task2 = task2;
        task1.inclusionTCompus++;
        task2.inclusionTCompus++;
    }


    @Override
    public int executeMs() {
        int currentTask = (int)(Math.random()*2)+1;
        if(currentTask == 1){
            return 5+task1.executeMs();
        }else {
            return 5+task2.executeMs();
        }
    }

    @Override
    public String taskName() {
        return "ConditionalTask("+task1.taskName()+","+task2.taskName()+")";
    }
}
