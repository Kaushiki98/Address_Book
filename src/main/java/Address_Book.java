import java.util.*;

public class Address_Book {

    //CONTACT DETAILS FROM USERS
    public void addContact() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter First name: ");
        String firstName = scan.next();

        System.out.println("Enter Last name: ");
        String lastName = scan.next();

        System.out.println("Enter address: ");
        String address = scan.next();

        System.out.println("Enter City: ");
        String city = scan.next();

        System.out.println("Enter State: ");
        String state = scan.next();

        System.out.println("Enter Zip code: ");
        String zip = scan.next();

        System.out.println("Enter Phone number: ");
        String phoneNum = scan.next();

        System.out.println("Enter Email: ");
        String email = scan.next();

        System.out.println("First Name= " + firstName + "\nLast Name= " + lastName + "\nAddress= " + address + "\nCity= " + city + "\nState= " + state + "\nZip Code= " + zip + "\nPhone Number= " + phoneNum + "\nEmail ID= " + email);
    }

    public static void main(String[] args) {

        //WELCOME MESSAGE
        System.out.println("Welcome to Address Book Program");
        Address_Book add = new Address_Book();
        add.addContact();

    }
}

