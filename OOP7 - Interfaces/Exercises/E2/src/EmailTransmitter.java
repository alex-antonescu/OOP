import java.util.ArrayList;
import java.util.List;

public class EmailTransmitter implements Transmitter {
    private Message message;
    private List<Message> buffer;

    public EmailTransmitter() {
        this.buffer = new ArrayList<>();
    }

    public Message getMessage() {
        return message;
    }

    @Override
    public void store(Message message) {
        buffer.add(message);
    }

    @Override
    public Message retrieve(Person receiver) {
        return message;
    }

    @Override
    public String getType(){
        return "(EMAIL)";
    }

    public void notifyMessage(Message m, Transmitter t){
        System.out.println("Notificare");
        t.retrieve(m.getSender());
    }
}
