public class AmendaPoluareSpatiuPublic extends Amenda {
    private int[] factorZonal = {1, 2, 3, 4};
    private int zona;

    public AmendaPoluareSpatiuPublic(String CNP, int factor) {
        super(CNP);
        try {
            zona = this.factorZonal[factor - 1];
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Factor zonal inexistent!");
            System.out.println("Factorul zonal implicit a fost ales{1}");
            zona = this.factorZonal[0];
        }
    }

    @Override
    public int valoareAmenda() {
        return 200 * zona;
    }

    @Override
    public String getTip() {
        return "Poluare";
    }
}
