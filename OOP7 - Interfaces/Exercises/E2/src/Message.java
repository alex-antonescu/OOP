public class Message {
    private Person sender;
    private Person receiver;
    private String mesaj;
    private Transmitter transmitter;


    public Message(Person sender, Person receiver, String mesaj, Transmitter transmitter) {
        this.sender = sender;
        this.receiver = receiver;
        this.mesaj = mesaj;
        this.transmitter = transmitter;
    }


    public Person getSender() {
        return sender;
    }

    @Override
    public String toString() {
        return sender + " said to " + receiver + " " + transmitter.getType() + " : " + mesaj;

    }
}
