import java.util.ArrayList;

public class MessagingService {
    private ArrayList<Message> messages;
    public MessagingService() {
        this.messages = new ArrayList<>();
    }

    public void addMessage(Message message) {
        if (message.getContent().length() > 280) {
            return;
        }

        this.messages.add(message);
    }

    public ArrayList<Message> getMessages() {
        return this.messages;
    }
}
