package person;

import person_ADT.Person_ADT;

public class Person implements Person_ADT {
    private String firstName;
    private String lastName;
    private String emailAddress;
    private StringBuilder contactNumbers = new StringBuilder();

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public StringBuilder getContactNumbers() {
        return contactNumbers;
    }

    @Override
    public void appendContactNumbers(String newcontact) {
        if (contactNumbers.length() == 0) {
            contactNumbers.append(" ").append(newcontact);
        } else {
            contactNumbers.append(", ").append(newcontact);
        }
    }
}
