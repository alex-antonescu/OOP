public class Wrapper{
public static class Coada {
    private int dimensiune;
    private Card[] stocareCarduri;

    public Coada(int dimensiune) {
        this.dimensiune = dimensiune;
        if (dimensiune < 0) {
            throw new ArgumentIllegalException();
        }
        stocareCarduri = new Card[dimensiune];
    }

    public boolean isFull() {
        boolean isFull = true;
        for (var element : stocareCarduri) {
            if (element == null) {
                isFull = false;
            }
        }
        return isFull;
    }

    public boolean isEmpty(){
        boolean isEmpty = true;
        for (var element : stocareCarduri) {
            if (element != null) {
                isEmpty = false;
                break;
            }
        }
        return isEmpty;

    }

    public void addCard(Card card) {
        if (isFull()) {
            throw new OutOfBoundaryException("Nu mai exista loc de alte carduri!");
        }
        for (int i = 0; i < dimensiune; i++) {
            if (stocareCarduri[i] == null) {
                stocareCarduri[i] = card;
                break;
            }
        }
    }

    public Card returnDeleteCard() {
        if(isEmpty()){
            throw new OutOfBoundaryException("Totul e gol aici...");
        }
        var last = new Card();
        for (int i = 0; i < dimensiune; i++) {
            if (stocareCarduri[i] != null) {
                last = stocareCarduri[i];
                stocareCarduri[i] = null;
                break;
            }
        }
        System.out.println("Deleted!");
        return last;
    }

    public void showContent(){
        for(var card: stocareCarduri){
            System.out.println(card);
        }
    }

    public boolean esteInCoada(Strategie tipCard){
        boolean isFound = false;
        for(var card : stocareCarduri){
           if(tipCard.conditie(card)){
               isFound = true;
               break;
           }
        }
        return isFound;
    }

}

}

