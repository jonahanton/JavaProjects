package contacts;

import java.util.ArrayList;
import java.util.List;

public class ContactManager {

    private List<Contact> contactList = new ArrayList<>();

    public void add(Person person, ContactInfo contactInfo) {
        Contact contact = new Contact(person, contactInfo);
        contactList.add(contact);
    }

    public List<ContactInfo> contactDetails(Person person) {
        List <ContactInfo> contactInfoList = new ArrayList<>();
        for (Contact contact : contactList) {
            if (contact.isFor(person)) {
                contactInfoList.add(contact.getContactInfo());
            }
        }
        return contactInfoList;
    }

    public void spam(String msg) {
        for (Contact contact : contactList) {
            ContactInfo contactInfo = contact.getContactInfo();
            contactInfo.sendMessage(msg);
        }
    }
}
