package menuprogram;

import contacts.Contacts;

public class Main {
    public static void main(String[] args) {
        Contacts contacts = new Contacts();
        contacts.addContact();
        contacts.addContact();
        contacts.showContact();
    }
}
