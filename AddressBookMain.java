package com.Bridgelabz.AddressBook;

import java.util.Scanner;

public class AddressBookMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("welcome to Address Book System!...");
		AddAddressBook addressBook = new AddAddressBook();
		addressBook.addContact();

	}

}
