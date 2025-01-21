import java.util.ArrayList;
import java.util.List;

public class GreutateMultipla extends Greutate{
    private List<Greutate> greutateMultipla;
    private int nrGreutatiSimple;
    private int nrGreutatiDuble;
    private Greutate gSimpla;
    private Greutate gDubla;

    public GreutateMultipla(
                            int nrGreutatiSimple, int nrGreutatiDuble,
                            Greutate gSimpla, Greutate gDubla) {
        super(0);
        this.greutateMultipla = new ArrayList<>();
        this.nrGreutatiSimple = nrGreutatiSimple;
        this.nrGreutatiDuble = nrGreutatiDuble;
        this.gSimpla = gSimpla;
        this.gDubla = gDubla;

        for(int i = 0; i<nrGreutatiSimple; i++)
            greutateMultipla.add(gSimpla);
        for(int i = 0; i< nrGreutatiDuble; i++)
            greutateMultipla.add(gDubla);
    }

    @Override
    public int capacitate(){
        int sum = 0;
        for(Greutate g : greutateMultipla)
            sum += g.capacitate();
        return sum;
    }
}
