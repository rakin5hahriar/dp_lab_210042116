using lab007.Interface; 
using lab007.Concrete;

namespace lab007.Adapters;

public class FacebookAdepter: iNotification
{
    private FacebookNotification _faceBookNotification;
    public FacebookAdepter(FacebookNotification faceBookNotification)
    {
        this._faceBookNotification = faceBookNotification;
    }

    public List<string> GetNotification()
    {
        return _faceBookNotification.GetFbNotification();
        
    }
}