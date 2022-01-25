package contacts;

public class Email extends ContactInfo implements TextMessageEnabled {

    private String address;

    public Email (String address) {
        this.address = address;
    }

    @Override
    public String contactInfo() {
        return address;
    }

    @Override
    public String contactInfoType() {
        return "email";
    }

    @Override
    public void sendMessage(String msg) {
        sendTextMessage(msg);
    }

    @Override
    public void sendTextMessage(String msg) {
        System.out.println(msg);
        System.out.println(address);
    }
}
