package channel;

public class SMSChannel implements NotificationChannel{
    @Override
    public void sendMessage(String message) {
        System.out.println("[SMS] " + message);
    }
}
