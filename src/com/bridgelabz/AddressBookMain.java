package com.bridgelabz;
/*
Declaring Main method Here
Defining newContact Object
And Printing The Contact Details
 */

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.print("Welcome to Address Book Program \n");

        ContactDetails newContact = new ContactDetails();
        newContact.setFirstName("anjiraj\n");
        newContact.setLastName("ardula \n");
        newContact.setAddressCity("nalgonda \n");
        newContact.setState("Telangana \n");
        newContact.setZip(508207);
        newContact.setPhoneNumber(833877108);
        newContact.setEmail("anjirajardula@gmail.com .\n");
        System.out.println("The Contact is : \n" +newContact);

    }




}
