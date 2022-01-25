package contacts;

public class MobilePhone extends Phone implements AudioMessageEnabled, TextMessageEnabled {

    public MobilePhone(String phoneNumber) {
        super(phoneNumber);
    }

    public void sendTextMessage(String msg) {
        System.out.println(msg);
        System.out.println(contactInfo());
    }

    @Override
    public void sendMessage(String msg) {
        sendTextMessage(msg);
    }
}
