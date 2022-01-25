package contacts;

public class Phone extends ContactInfo implements AudioMessageEnabled {

    private String phoneNumber;

    public Phone (String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    @Override
    public void sendAudioMessage(Audio msg) {
        System.out.println(msg);
        System.out.println(phoneNumber);
    }

    @Override
    public String contactInfo() {
        return phoneNumber;
    }

    @Override
    public String contactInfoType() {
        return "phone";
    }

    @Override
    public void sendMessage(String msg) {
        Audio audioMsg = new Audio(msg);
        sendAudioMessage(audioMsg);
    }
}
