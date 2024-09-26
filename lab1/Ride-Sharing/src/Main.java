import com.Payment.PayPalPayment;
import com.notify.*;
import com.rideType.BikeRide;
import com.riderdriver.*;
import com.trip.Trip;


public class Main {
    public static void main(String[] args) {
        Rider rider = new Rider("Rider 1");
        Driver driver = new Driver("Driver 1");
        NotificationService notificationService = new Email("abc@gmail.com");
        rider.setNotificationService(notificationService);
        driver.setNotificationService(notificationService);
        rider.requestRide("BikeRide", 10);
        driver.acceptRide();
        Trip trip = new Trip(new BikeRide(10), driver, rider);
        trip.startTrip();
        trip.completeTrip(new PayPalPayment("ss@gmail.com"));
    }
}
