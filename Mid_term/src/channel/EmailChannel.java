package channel;

public class EmailChannel implements NotificationChannel{
    @Override
    public void sendMessage(String message) {
        System.out.println("[EMAIL] " + message);
    }
}
