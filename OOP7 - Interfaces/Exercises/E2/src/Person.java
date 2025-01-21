public class Person {
    private String nume;
    private Transmitter transmitter;


    public Person(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        return nume;
    }

    public void setTransmitter(Transmitter transmitter) {
        this.transmitter = transmitter;
    }

    public void send(Person p, String m){
        Message mesaj = new Message(this, p,m,transmitter);
        this.transmitter.store(mesaj);
        System.out.println(mesaj);
    }

    public void requestMessage(Person receiver){
        this.transmitter.retrieve(receiver);
    }




}
