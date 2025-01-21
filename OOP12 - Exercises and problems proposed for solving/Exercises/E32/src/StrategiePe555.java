public class StrategiePe555 implements Strategie {
    private Card card;

    public StrategiePe555(Card card) {
        this.card = card;
    }

    @Override
    public boolean conditie(Card card) {
        int counter = 0;
        var iban = card.getIBAN();
        for(var numar : iban){
            if(numar == 53) //ASCII for `5` is 53
                counter++;
        }
        return counter==3;
    }
}
