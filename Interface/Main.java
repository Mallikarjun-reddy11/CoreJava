package Interface;
public class Main {

    public static void main(String[] args) {

        Notification email = new EmailNotification();
        NotificationService service1 = new NotificationService(email);
        service1.notifyUser("Order Placed");

        Notification sms = new SMSNotification();
        NotificationService service2 = new NotificationService(sms);
        service2.notifyUser("Order Shipped");

        Notification whatsapp = new WhatsAppNotification();
        NotificationService service3 = new NotificationService(whatsapp);
        service3.notifyUser("Order Delivered");
    }
}