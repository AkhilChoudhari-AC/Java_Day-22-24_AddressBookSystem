package Com.BridgeLabz.AddressBookCollection;

public class ContactDetails {

    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private int zipCode;
    private long mobileNumber;
    private String emailId;

    public ContactDetails() {

    }


    public ContactDetails(String firstName, String lastName, String address, String city, String state, int zipCode,
                          long mobileNumber, String emailId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.mobileNumber = mobileNumber;
        this.emailId = emailId;
    }

    public String getFirstName() {
        return firstName;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getLastName() {
        return lastName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }


    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }


    public void setCity(String city) {
        this.city = city;
    }


    public String getState() {
        return state;
    }

    /**
     * The set method takes a parameter (state) and assigns it to the state
     * variable. The this keyword is used to refer to the current object.
     *
     * @param state
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * The get method returns the value of the variable zipcode.
     *
     * @return -return to method created
     */
    public int getZipCode() {
        return zipCode;
    }


    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    /**
     * The get method returns the value of the variable MobileNumber.
     *
     * @return -return to method created
     */
    public long getMobileNumber() {
        return mobileNumber;
    }

    /**
     * The set method takes a parameter (mobileNumber) and assigns it to the
     * mobileNumber variable. The this keyword is used to refer to the current
     * object.
     *
     * @param mobileNumber
     */
    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    /**
     * The get method returns the value of the variable EmailId.
     *
     * @return -return to method created
     */
    public String getEmailId() {
        return emailId;
    }

    /**
     * The set method takes a parameter (emailId) and assigns it to the emailId
     * variable. The this keyword is used to refer to the current object.
     *
     * @param emailId
     */
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    @Override
    public String toString() {
        return "ContactDetails{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", address='"
                + address + '\'' + ", city='" + city + '\'' + ", state='" + state + '\'' + ", zipCode=" + zipCode
                + ", mobileNo=" + mobileNumber + ", emailId='" + emailId + '\'' + '}';

    }

}

