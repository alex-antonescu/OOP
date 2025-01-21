package reader.output.text;
import elemente.*;
import reader.output.IReaderOutput;

public class ReaderOutputText implements IReaderOutput{
    @Override
    public void afisareStiva(Stiva s) {
        for(Punct p : s.getListaElemente()){
            System.out.println(p);
        }
    }
}
