import java.util.ArrayList;
import java.util.List;

public class MailTransmitter implements Transmitter{
    private Message message;
    private List<Message> buffer;
    private int notifySizeBuffer;

    public MailTransmitter(int size) {
        this.notifySizeBuffer = size;
        this.buffer = new ArrayList<>();
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
        return "(MAIL)";
    }


    public void notifyMessage(Message m, Transmitter t){
        if(buffer.size() == notifySizeBuffer){
            System.out.println("Notificare");
            t.retrieve(m.getSender());
            buffer.clear();
        }
    }
}
