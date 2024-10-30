package M06_PartyList;

import java.util.ArrayList;
import java.util.Scanner;

/* Problem Definition 
 * 1. Have a list of guests
 * 2. Can add to the list of guests
 * 3. Edit a guest's name
 * 4. Remove a guest name
 * 5. Show all the guests
 * 
 * 1. MODELLING - what data types to represent my problem and my solution
 * PRIMITIVES: int, float, double, char, String* (immutable object)
 * REFERENCES: array, ArrayList (generic List), objects
 */
public class Guests {
    public static void main(String args[]) {
        ArrayList<String> guests = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        // display a menu that allows the user to choose
        // between seeing all the guests, adding a new guest
        // editing a guest or removing a guest
        while (true) {

            displayMenu();
            int choice = makeAChoice(sc, 1, 5);

            // implement the other options
            if (choice == 1) {
                displayGuests(guests);
            }

            if (choice == 2) {
                // add a new guest
                addGuest(guests, sc);
            }

            if (choice == 3) {
                editGuest(guests, sc);
            }

            if (choice == 4) {
                deleteGuest(guests, sc);
            }

            if (choice == 5) {
                break;
            }
        }
        System.out.println("Goodbye!");
    }

    public static void displayMenu() {
        System.out.println();
        System.out.println("1. Show all guests");
        System.out.println("2. Add a new guest");
        System.out.println("3. Edit a guest");
        System.out.println("4. Delete a guest");
        System.out.println("5. Quit");
    }

    public static int makeAChoice(Scanner sc, int lowerBound, int upperBound) {
        int choice;
        while (true) {
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            // clear the keyboard buffer to get rid of the \n in there
            sc.nextLine();
            System.out.println("Your choice: " + choice);
            if (choice >= lowerBound && choice <= upperBound) {
                break;
            } else {
                System.out.println("Please enter between " + lowerBound + " to " + upperBound);
            }
        }

        return choice;
    }

    public static void displayGuests(ArrayList<String> guests) {
        System.out.println();
        System.out.println("Displaying all Guests");
        // for (String name : guests) {
        // System.out.println(name);
        // }

        for (int i = 0; i < guests.size(); i++) {
            System.out.println(i + ". " + guests.get(i));
        }
    }

    public static void addGuest(ArrayList<String> guests, Scanner sc) {
        System.out.println();
        System.out.println("Add new Guest");
        System.out.print("Enter the name: ");
        String guestName = sc.nextLine(); // guest names usually have spaces, so we'll use nextLine
        // note: if ever need to clear keyboard buffer, use `sc.nextLine`
        guests.add(guestName);

    }

    public static void editGuest(ArrayList<String> guests, Scanner sc) {
        System.out.println();
        System.out.println("Edit Guest");
        displayGuests(guests);
        System.out.print("Choose the guest to edit: ");
        
        int guestIndex = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter the new name of the guest: ");
        String newGuestName = sc.nextLine();

        // replace the guest at guestIndex with the new guest name
        guests.set(guestIndex, newGuestName);

    }

    public static void deleteGuest(ArrayList<String> guests, Scanner sc) {
        System.out.println("Delete Guest");

        System.out.println("Edit Guest");
        displayGuests(guests);
        System.out.print("Choose the guest to edit: ");
        
        int guestIndex = sc.nextInt();
        sc.nextLine();

        guests.remove(guestIndex);
    }
}
