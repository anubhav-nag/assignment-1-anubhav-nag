package person;

public class Person {
    private String firstName;
    private String lastName;
    private String emailAddress;
    private StringBuilder contactNumbers;

    public Person(String firstName, String lastName, String emailAddress, StringBuilder contactNumbers) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.contactNumbers = contactNumbers;
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
}
