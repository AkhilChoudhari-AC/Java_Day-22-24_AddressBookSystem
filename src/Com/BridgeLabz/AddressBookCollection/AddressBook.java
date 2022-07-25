package Com.BridgeLabz.AddressBookCollection;

import java.util.*;
import java.util.stream.Collectors;

public class AddressBook {

    ContactDetails person = new ContactDetails();
    List<ContactDetails> contactDetailsList = new ArrayList<>();

    /**
     * Declaring The Add Contact Method And Entering The Contact Details By Using
     * Scanner Class And Printing The Contact Details Of Person
     */
    public void addContact() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of contacts you want to enter");
        int number = scanner.nextInt();
        for (int i = 0; i < number; i++) {

            /**
             * checking the duplicate contact by contact name.
             */
            System.out.println("Enter the first name of person");
            String fName = scanner.next();
            if (fName.equals(person.getFirstName())) {
                System.out.println("The entered person is already exist. Enter new name");
            } else {
                System.out.println("Enter the contact details of person ");
                writeContact();
                System.out.println("contact added Successfully");
            }
        }
    }

    /**
     * created method writeContact() to create a new contacts to the AddressBook
     */
    public void writeContact() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Name : ");
        String firstName = scanner.next();
        System.out.println("Enter Last Name : ");
        String lastName = scanner.next();
        System.out.println("Enter Address : ");
        String address = scanner.next();
        System.out.println("Enter City : ");
        String city = scanner.next();
        System.out.println("Enter State : ");
        String state = scanner.next();
        System.out.println("Enter ZipCode : ");
        int zipCode = scanner.nextInt();
        System.out.println("Enter Mobile Number : ");
        long mobileNumber = scanner.nextLong();
        System.out.println("Enter EmailId : ");
        String emailId = scanner.next();
        person = new ContactDetails(firstName, lastName, address, city, state, zipCode, mobileNumber, emailId);
        contactDetailsList.add(person);
    }

    /**
     * create method searchByName that is Ability to search Person across the
     * multiple AddressBook by name
     *
     * @param name -passing name
     */
    public void searchByName(String name) {
        List<ContactDetails> collect = contactDetailsList.stream().filter(p -> p.getFirstName().equalsIgnoreCase(name))
                .collect(Collectors.toList());
        for (ContactDetails contact : collect) {
            System.out.println("Search result: " + contact);
        }
    }


    public void searchByCity(String city) {
        List<ContactDetails> collect = contactDetailsList.stream().filter(p -> p.getCity().equalsIgnoreCase(city))
                .collect(Collectors.toList());
        for (ContactDetails contact : collect) {
            System.out.println("Search result: " + contact);
        }
    }

    public void searchByState(String state) {
        List<ContactDetails> collect = contactDetailsList.stream().filter(p -> p.getCity().equalsIgnoreCase(state))
                .collect(Collectors.toList());
        for (ContactDetails contact : collect) {
            System.out.println("Search result: " + contact);
        }
    }

    /**
     * Declaring The Edit Contact Method TO Edit The Details Of Contact The Details
     * Of Contact Edit By Using FirstName If First Name Is Match The Contact Will
     * Edit
     */
    public void editContact() {
        System.out.println("Enter firstname of contact you want edit");
        Scanner scanner = new Scanner(System.in);
        String editName = scanner.next();
        boolean edited;
        for (int i = 0; i < contactDetailsList.size(); i++) {
            String name = contactDetailsList.get(i).getFirstName();
            if (name.equalsIgnoreCase(editName)) {
                contactDetailsList.remove(person);
                writeContact();
                edited = true;
                break;
            }
        }
        if (!edited) {
            System.out.println("enter name is incorrect");
        }
    }

    /**
     * Declaring Delete Contact Method TO delete The Details Of Contact The Details
     * Of Contact Delete By Using FirstName If First Name Is Match Then Contact Will
     * Delete
     */
    public void deleteContact() {
        System.out.println("Enter the first name of contact you want to delete");
        Scanner scanner = new Scanner(System.in);
        String deleteName = scanner.next();
        for (int i = 0; i < contactDetailsList.size(); i++) {
            if (deleteName.equalsIgnoreCase(contactDetailsList.get(i).getFirstName())) {
                contactDetailsList.remove(i);
                System.out.println("contact delete successfully");
            } else {
                System.out.println("enter name dose not exit");
            }
        }
    }

    /**
     * create method searchByOptions() by searching the person using option like
     * name, city, state and from previous menu
     */
    public void searchByOptions() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter\n 1. By name\n 2. By city\n 3. By state\n 4. for previous menu");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Enter name: ");
                    String name = scanner.nextLine();
                    searchByName(name);
                    break;
                case 2:
                    System.out.println("Enter city: ");
                    String city = scanner.nextLine();
                    searchByCity(city);
                    break;
                case 3:
                    System.out.println("Enter state: ");
                    String state = scanner.nextLine();
                    System.out.println(state);
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Entered choice is incorrect!.. please enter correct choice");
            }
        }
    }
}