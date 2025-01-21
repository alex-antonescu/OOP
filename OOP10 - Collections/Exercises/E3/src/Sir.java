public class Sir extends Tip{
    private String sir;

    public Sir(String sir) {
        this.sir = sir;
    }

    @Override
    public String getTip() {
        return super.getTip() + "String" ;
    }

    @Override
    public String toString() {
        return sir;
    }
}
