package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        ContactsManager myContactManager = new ContactsManager();

        //creating Contact variable
        Contact searchResult;

        Contact Aman =new Contact();

        Aman.name="Aman";
        Aman.email="aman420@gmail.com";
        Aman.phoneNumber="9876543210";

        Contact Suryansh =new Contact();

        Suryansh.name="Suryansh";
        Suryansh.email="suryansh2341@gmail.com";
        Suryansh.phoneNumber="8796543210";

        Contact meenakshi =new Contact();

        meenakshi.name="Meenakshi";
        meenakshi.email="menakshi2345@gmail.com";
        meenakshi.phoneNumber="7896543210";

        myContactManager.addContact(Aman);
        myContactManager.addContact(Suryansh);
        myContactManager.addContact(meenakshi);

        searchResult =myContactManager.searchContact("Aman");
        System.out.println(searchResult.name + " : " + searchResult.phoneNumber + "  " +searchResult.email);

        searchResult =myContactManager.searchContact("Suryansh");
        System.out.println(searchResult.name + " : " + searchResult.phoneNumber + "  " + searchResult.email);

        searchResult =myContactManager.searchContact("Meenakshi");
        System.out.println(searchResult.name + " : " + searchResult.phoneNumber +"  " + searchResult.email);
// project completed here
    }
}
