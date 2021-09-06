package com.bridgelabz;
/*
Declaring Main method Here
Defining newContact Object
And Printing The Contact Details
 */

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.print("Welcome to Address Book Program \n");
        Scanner sc = new Scanner(System.in);
        NewAddressBook person = new NewAddressBook();
        person.addContact();
        System.out.println("Enter Y To Edit The Contact");
        String op = sc.nextLine();
        //If Condition To Edit The Contact Details Of Person
        if (op.equals("y") || op.equals("Y")) {
            person.editContact(person); //Calling The Edit Contact Method
            System.out.println("You have Entered following data");
            System.out.println("The Contact Details After Editing : " + person);


    }




}}
