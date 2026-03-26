

class Notifier
{
    public void send(String message)
    {
        System.out.println("General Alert: " + message);
    }

    protected void send(String message, String email)
    {
        System.out.println("Email sent to " + email + ": " + message);
    }

    void send(String message, long phone)
    {
        System.out.println("SMS sent to " + phone + ": " + message);
    }

    private void send(int code)
    {
        System.out.println("Internal notification code: " + code);
    }

    public void accessPrivate(int code)
    {
        send(code);
    }
}

class AppNotifier extends Notifier
{
    public void useMethods()
    {
        send("Server Down");
        send("Meeting Reminder", "user@gmail.com");
        send("OTP Message", 9876543210L);
        accessPrivate(101);
    }
}

public class Main1
{
    public static void main(String[] args)
    {
        AppNotifier obj = new AppNotifier();
        obj.useMethods();
    }
}
