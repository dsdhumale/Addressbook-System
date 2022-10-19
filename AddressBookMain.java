package com.Bridgelabz.AddressBook;

import java.util.Scanner;

public class AddressBookMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Address Book Program");

		AddAddressBook obj = new AddAddressBook();
		int option;
		boolean condition = true;

		while (condition) {
			System.out.println("1.ADD CONTACT \n2.DISPLAY CONTACT \n3.EDIT CONTACT \n4.DELETE CONTACT \n5.EXIT");
			System.out.println("Enter the Option Number");
			option = sc.nextInt();

			switch (option) {
			case 1:
				obj.addContact();
				break;
			case 2:
				obj.display();
				break;
			case 3:
				obj.editContacts();
				break;
			case 4:
				obj.deleteContact();
				break;
			case 5:
				condition=false;
				break;

			}

		}

	}

}
