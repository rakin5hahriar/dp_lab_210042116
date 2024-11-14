package MyApp;

public class EmailNotification implements Notify{

    @Override
    public void sendNotification(String message, String receiver) {
        System.out.println("Sending Notification through Email: \nMessage: " + message + "\nReceiver: " + receiver + "\n");
    }
}
