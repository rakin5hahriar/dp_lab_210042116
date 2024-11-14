package MyApp;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Notification System\n\n");

        Notify emailNotification = new EmailNotification();

        emailNotification.sendNotification("Hello, this is a mail", "Rakin");

        System.out.println("\n\n");

        Notify smsNotification = new SmsNotification();
        smsNotification.sendNotification("Hello, this is a SMS", "Rakin");

        System.out.println("\n\n");

        Notify postalMailNotificationAdapter = new PostalMailNotificationAdapter(new PostalMailNotification(), "IUT, Gazipur", 1704);

        postalMailNotificationAdapter.sendNotification("Hello, this is a e-postal mail", "Rakin");


    }
}
