package menuprogram;

import contacts.Contacts;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Contacts contacts = new Contacts();
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Anubhav's Contact List App");
        System.out.println("<<Caution: Name should start with a capital alphabet >>");
        String welcome = "\n -------- * -------- * -------- *-------- \n" +
                "Press 1 to add a new contact\n" +
                "Press 2 to view all contacts\n" +
                "Press 3 to search for a contact\n" +
                "Press 4 to delete a contact\n" +
                "Press 5 to exit program ";
        boolean flag = false;
        do {
            System.out.println(welcome);
            System.out.println();
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println();
                    contacts.addContact();
                    break;
                case 2:
                    System.out.println();
                    contacts.showContact();
                    break;
                case 3:
                    contacts.searchContact();
                    System.out.println();
                    break;
                case 4:
                    contacts.deleteContact();
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Program is terminated sucessfully!");
                    flag = true;
                    break;
                default:
                    System.out.println("Invalid Input!");
            }
        } while (!flag);
    }
}
