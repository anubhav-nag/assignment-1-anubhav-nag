package contacts;

import contact_regex.Contact_Validation;
import contacts_ADT.Contacts_ADTInterface;
import person.Person;

import java.util.ArrayList;
import java.util.Scanner;

public class Contacts implements Contacts_ADTInterface {

    Scanner sc = new Scanner(System.in);
    ArrayList<Person> personArrayList = new ArrayList<>();

    @Override
    public void addContact() {
        Person person = new Person();
        int checkWrong = 0;
        char check = 'y';
        System.out.println("You have chosen to add a new contact: ");
        System.out.println("Please enter the name of the Person: ");
        while (checkWrong < 5) {
            System.out.print("First Name: ");
            String firstName = sc.next();
            if (Contact_Validation.checkFirstName(firstName)) {
                person.setFirstName(firstName);
                checkWrong = 0;
                break;
            } else {
                checkWrong++;
                System.out.println("Invalid input! chances left: " + (5 - checkWrong));
            }
            if (checkWrong == 5) {
                System.out.println("Contact can't be saved.");
                return;
            }
        }
        while (checkWrong < 5) {
            System.out.print("Last Name: ");
            String lastName = sc.next();
            if (Contact_Validation.checkLastName(lastName)) {
                person.setLastName(lastName);
                checkWrong = 0;
                break;
            } else {
                checkWrong++;
                System.out.println("Invalid input! chances left: " + (5 - checkWrong));
            }
            if (checkWrong == 5) {
                System.out.println("Contact can't be saved.");
                return;
            }
        }
        while (check != 'n') {
            while (checkWrong < 5) {
                System.out.print("Contact Number: ");
                String contactNumber = sc.next();
                if (Contact_Validation.checkContactNumber(contactNumber)) {
                    person.appendContactNumbers(contactNumber);
                    System.out.print("Would you like to add another contact number? (y/n): ");
                    check = sc.next().charAt(0);
                    checkWrong = 0;
                    break;
                } else {
                    checkWrong++;
                    System.out.println("Invalid input! chances left: " + (5 - checkWrong));
                }
                if (checkWrong == 5) {
                    System.out.println("Contact can't be saved.");
                    return;
                }
            }
        }
        System.out.print("Would you like to add email address? (y/n): ");
        check = sc.next().charAt(0);
        if (check == 'y') {
            while (checkWrong < 5) {
                System.out.print("Email: ");
                String emailAddress = sc.next();
                if (Contact_Validation.checkEmail(emailAddress)) {
                    person.setEmailAddress(emailAddress);
                    checkWrong = 0;
                    break;
                } else {
                    checkWrong++;
                    System.out.println("Invalid input! chances left: " + (5 - checkWrong));
                }
                if (checkWrong == 5) {
                    System.out.println("Contact can't be saved.");
                    return;
                }
            }
        }
    }
}
