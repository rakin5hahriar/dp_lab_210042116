using lab007.Interface;
using lab007.Concrete;
using lab007.Adapters;

namespace lab007.Facade;

public class NotificationFacade
{
    private readonly List<iNotification> _notifications;

    public NotificationFacade()
    {
        _notifications = new List<iNotification>();
        
        _notifications.Add(new FacebookAdepter(new FacebookNotification()));
        
    }

    public void ShowNotification()
    {
        foreach (iNotification notification in _notifications)
        {
            Console.WriteLine(notification.GetNotification());
        }
    }
}