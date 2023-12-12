import java.util.Scanner;
import java.util.ArrayList;
class Contact {
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phoneNumber;
    private String email;

    public Contact(String firstName,String lastName,String address ,String city,String state, String zip,String phoneNumber,String email)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this. zip =zip ;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

   
    
    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    
    }


}

public class AddressBook {
    public static void main(String[] args) {
        System.out.println("Welcome to AddressBook");
       ArrayList<Contact> addressBook = new ArrayList<>();
        
    }
}