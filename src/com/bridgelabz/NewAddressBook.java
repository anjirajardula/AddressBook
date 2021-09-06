package com.bridgelabz;

import java.util.Scanner;

public class NewAddressBook {
    Scanner sc = new Scanner(System.in);
    private String firstName;
      /*
    Declaring The Add Contact Method
    And Entering The Contact Details By Using Scanner Class
    And Printing The Contact Details Of Person
     */

    public void addContact(){

        ContactDetails person = new ContactDetails();
        System.out.println("Enter First Name: ");
        String firstName = sc.nextLine();
        System.out.println("Enter last Name: ");
        String lastName = sc.nextLine();
        System.out.println("Enter your addressCity: ");
        String addressCity = sc.nextLine();
        System.out.println("Enter your state: ");
        String state = sc.nextLine();
        System.out.println("Enter zip code : ");
        Long zip = sc.nextLong();
        sc.nextLine();
        System.out.println("Enter phone number: ");
        Long phoneNumber = sc.nextLong();
        sc.nextLine();
        System.out.println("Enter your EMail ID: ");
        String email = sc.nextLine();
        person.setFirstName(firstName);
        person.setLastName(lastName);
        person.setAddressCity(addressCity);
        person.setState(state);
        person.setZip(zip.intValue());
        person.setPhoneNumber(phoneNumber.intValue());
        person.setEmail(email);
        System.out.println("The Contact Details of "+firstName+ "\n"+ person);
    }
    /*
    Declaring The Edit Contact Method
    TO Edit The Details Of Contact
    The Details Of Contact Edit By Using FirstName
    If First Name Is Match The Contact Will Edit
    */
    public void editContact(NewAddressBook person){
        //Scanner editName = new Scanner(System.in);
        System.out.println("Enter the firstName of person");
        String editName = sc.nextLine();
        if (editName.equalsIgnoreCase(person.getfirstName()));
        addContact();

        System.out.println("The Entered First Name Is Not Match");
        editContact(person);
    }

    private String getfirstName() {
        return firstName;
    }


}

