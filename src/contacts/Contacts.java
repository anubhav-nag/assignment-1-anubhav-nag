package contacts;

import contacts_ADT.Contacts_ADTInterface;
import person.Person;

import java.util.ArrayList;
import java.util.Scanner;

public class Contacts implements Contacts_ADTInterface {

    Scanner sc = new Scanner(System.in);
    ArrayList<Person> personArrayList = new ArrayList<>();

    @Override
    public void addContact() {
        System.out.println("You have chosen to add a new contact: ");
        System.out.println("Please enter the name of the Person: ");
        System.out.print("First Name: ");

        System.out.print("Last Name: ");
        System.out.print("Contact Number: ");
        System.out.print("Would you like to add another contact number? (y/n): ");
        System.out.print("Contact Number: ");
        System.out.print("Would you like to add email address? (y/n): ");
        System.out.print("Email Address: ");
    }
}
