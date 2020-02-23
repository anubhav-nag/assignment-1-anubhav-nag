package menuprogram;

import contacts.Contacts;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Contacts contacts = new Contacts();
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Anubhav's Contact List App");
        String welcome = "\n--------*--------*--------*--------\n" +
                "Press 1 to add a new contact\n" +
                "Press 2 to view all contacts\n" +
                "Press 3 to search for a contact\n" +
                "Press 4 to delete a contact\n" +
                "Press 5 to exit program ";
        boolean flag = false;
        while (true) {
            System.out.println(welcome);
            System.out.println();
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    contacts.addContact();
                    break;
                case 2:
                    contacts.showContact();
                    break;
                case 3:
                    break;
                case 4:
                    contacts.deleteContact();
                    break;
                case 5:
                    System.out.println("Program is terminated sucessfully!");
                    flag = true;
                    break;
                default:
                    System.out.println("Invalid Input!");
            }
            if (flag) {
                break;
            }
        }
    }
}
