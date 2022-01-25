package contacts;

public class Contact{

    private Person person;
    private ContactInfo contactInfo;

    public Contact(Person person, ContactInfo contactInfo) {
        this.person = person;
        this.contactInfo = contactInfo;
    }

    public boolean isFor(Person person) {
        if (this.person.equals(person)) {
            return true;
        }
        return false;
    }

    public ContactInfo getContactInfo() {
        return contactInfo;
    }
}
