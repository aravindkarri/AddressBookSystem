package com.bridgelabz;

import java.util.Scanner;

public class AddressBookMain
{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter How many numbers You want to Add ::");
        int size = scanner.nextInt();
        AddressBookService contact = new AddressBookService();

        for (int i = 0; i < size; i++) {
            contact.addContact();
            contact.diaplayContacts();
        }
    }
}
