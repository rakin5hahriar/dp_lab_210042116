namespace lab007.Concrete;


public class FacebookNotification
{
    List<string> _notifications;

    public FacebookNotification()
    {
        _notifications = new List<string>();
    }
    
    public void AddFbNotification(string notification)
    {
        _notifications.Add(notification);
    }

    public List<string> GetFbNotification()
    {
        return _notifications;
    }
}