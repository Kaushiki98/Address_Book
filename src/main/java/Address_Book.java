import java.util.*;

public class Address_Book {
    static Scanner scan = new Scanner(System.in);
    //User details
    public String firstName, lastName, address, city, state, email;
    public Integer zip;
    public Long phoneNum;
    //CONTACT DETAILS FROM USERS
    public void addContact() {
        System.out.println("Enter First name: ");
        firstName = scan.next();

        System.out.println("Enter Last name: ");
        lastName = scan.next();

        System.out.println("Enter address: ");
        address = scan.next();

        System.out.println("Enter City: ");
        city = scan.next();

        System.out.println("Enter State: ");
        state = scan.next();

        System.out.println("Enter Zip code: ");
        zip = scan.nextInt();

        System.out.println("Enter Phone number: ");
        phoneNum = scan.nextLong();

        System.out.println("Enter Email: ");
        email = scan.next();

        System.out.println("First Name= " + firstName + "\nLast Name= " + lastName + "\nAddress= " + address + "\nCity= " + city + "\nState= " + state + "\nZip Code= " + zip + "\nPhone Number= " + phoneNum + "\nEmail ID= " + email);
    }
    
    //TO EDIT CONTACT
    public void editcontact() {
        System.out.println("Enter your choice: ");
        System.out.println("1. To edit Address ");
        System.out.println("2. To edit City ");
        System.out.println("3. To edit State ");
        System.out.println("4. To edit Zip Code");
        System.out.println("5. To edit Phone Number ");
        System.out.println("6. To edit Email ");
        int choice = scan.nextInt();

        switch (choice) {

            case 1:
                System.out.println("Enter new Address: ");
                address = scan.next();
                break;
            case 2:
                System.out.println("Enter new City: ");
                city = scan.next();
                break;
            case 3:
                System.out.println("Enter new State: ");
                state = scan.next();
                break;
            case 4:
                System.out.println("Enter new Zip Code: ");
                zip = scan.nextInt();
                break;
            case 5:
                System.out.println("Enter new Phone Number: ");
                phoneNum = scan.nextLong();
                break;
            case 6:
                System.out.println("Enter new Email: ");
                email = scan.next();
                break;
            default:
                System.out.println("Invalid choice,try again.");
        }

        System.out.println("First Name= " + firstName + "\nLast Name= " + lastName + "\nAddress= " + address + "\nCity= " + city + "\nState= " + state + "\nZip Code= " + zip + "\nPhone Number= " + phoneNum + "\nEmail ID= " + email);
    }

    public static void main(String[] args) {

        //WELCOME MESSAGE
        System.out.println("Welcome to Address Book Program");
        Address_Book add = new Address_Book();

        System.out.println("Enter Number of entries: ");
        Integer numOfEnteries = scan.nextInt();
        for (int i = 0; i < numOfEnteries; i++) {
            add.addContact();
            System.out.println("To Edit contacts: ");
            add.editcontact();
        }
    }
}
