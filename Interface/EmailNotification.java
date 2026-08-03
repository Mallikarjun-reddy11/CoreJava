package Interface;

class EmailNotification implements Notification {

    @Override
    public void send(String message) {
        System.out.println("Email: " + message);
    }
}

class WhatsAppNotification implements Notification {

    @Override
    public void send(String message) {
        System.out.println("WhatsApp: " + message);
    }
}
class SMSNotification implements Notification {

    @Override
    public void send(String message) {
        System.out.println("SMS: " + message);
    }
}