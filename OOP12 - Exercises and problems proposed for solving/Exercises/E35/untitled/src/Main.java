public class Main {
    public static void main(String[] args) {
        //Generare taskuri
        SimpleTask t1 = new SimpleTask(155);
        SimpleTask t2 = new SimpleTask(5);
        SimpleTask t3 = new SimpleTask(4);
        BlockTask t4 = new BlockTask();

        //Prelucrare BlockTask, Task
        t4.insertTask(t2);
        t2.changeTime(1);

        Task t5 = new ConditionalTask(t1,t4);
        System.out.println(t5.taskName());
        t2.showInclusionTimes();

    }
}
