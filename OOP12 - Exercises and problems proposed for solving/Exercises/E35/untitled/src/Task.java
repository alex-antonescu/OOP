public abstract class Task {

    protected int inclusionTCompus;

    public abstract int executeMs();

    public abstract String taskName();

    public void showInclusionTimes(){
        System.out.println(inclusionTCompus);
    }
}
