package Com.BridgeLabz.AddressBookCollection;

public class AddressBook {

    private class Contact {
        String firstName, lastNmae, address, city, state, emailId;
        int zipCode;
        long mobileNumber;
    }

    /**
     * created method printContact for creating contacts in AddressBook
     */
    public void printContact() {
        Contact person = new Contact();
        person.firstName = "Akhil";
        person.lastNmae = "Choudhari";
        person.address = "OmColony";
        person.city = "AshokNagar";
        person.state = "Madhya Pradesh";
        person.zipCode = 473331;
        person.mobileNumber = 9090909090L;
        person.emailId = "akhil.20111998@gmail.com";
        System.out.println("Contact Details");
        System.out.println("Name          : " + person.firstName + " " + person.lastNmae + "\n" + "Address       : "
                + person.address + "\n" + "City          : " + person.city + "\n" + "State         : " + person.state
                + "\n" + "ZipCode       : " + person.zipCode + "\n" + "MobileNumber  : " + person.mobileNumber + "\n"
                + "EmailId       : " + person.emailId + "\n");
    }

    /**
     * Main method for manipulation Of Collections
     *
     * @param args - Default Java param (Not used)
     */
    public static void main(String[] args) {
        /**
         * created instance of AddressBook class
         */
        AddressBook addressBook = new AddressBook();
        /**
         * Calling method printContact for displaying contacts
         */
        addressBook.printContact();

    }

}
