package MyApp;

public class SmsNotification implements Notify{

    @Override
    public void sendNotification(String message, String receiver) {
        System.out.println("Sending Notification through SMS: \nMessage: " + message + "\nReceiver: " + receiver + "\n");
    }
}
