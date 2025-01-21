public class SimpleTask extends Task{
    private int timpExecutie;

    public SimpleTask(int timpExecutie) {
        this.timpExecutie = timpExecutie;
    }

    public void changeTime(int timpExecutieNou){
        timpExecutie = timpExecutieNou;
    }

    @Override
    public int executeMs() {
        return timpExecutie;
    }

    @Override
    public String taskName() {
        return "SimpleTask("+timpExecutie+")";
    }
}
