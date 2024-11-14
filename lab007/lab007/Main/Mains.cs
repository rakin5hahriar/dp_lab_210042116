using lab007.Interface;
using lab007.Concrete;
using lab007.Adapters;
using lab007.Facade;


namespace lab007.Main;

public class Mains
{
    public static void Main()
    {
        NotificationFacade notificationFacade = new NotificationFacade();
        notificationFacade.ShowNotification();
    }
}