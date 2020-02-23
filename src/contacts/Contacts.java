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
        System.out.println("You have chosen to add a new contact: ");
        System.out.println("Please enter the name of the Person: ");
        while (checkWrong < 5) {
            System.out.print("First Name: ");
            String firstName = sc.next();
            if (Contact_Validation.checkFirstName(firstName)) {
                person.setFirstName(firstName);
                checkWrong = 6;
            } else {
                checkWrong++;
                System.out.println("Invalid input! chances left: " + (5 - checkWrong));
            }
            if (checkWrong == 5) {
                System.out.println("Contact can't be saved.");
                return;
            }
        }
        System.out.print("Last Name: ");
        System.out.print("Contact Number: ");
        System.out.print("Would you like to add another contact number? (y/n): ");
        System.out.print("Contact Number: ");
        System.out.print("Would you like to add email address? (y/n): ");
        System.out.print("Email Address: ");
    }
}
