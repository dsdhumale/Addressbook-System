package com.Bridgelabz.AddressBook;

import java.util.Scanner;

public class AddAddressBook {

	Scanner scanner = new Scanner(System.in);
	Contacts contact;

	public void addContact() {
		Scanner scanner = new Scanner(System.in);
		contact = new Contacts();
		System.out.println("Enter the First name");
		String firstName = scanner.nextLine();

		System.out.println("Enter the Last name");
		String lastName = scanner.nextLine();
		System.out.println("Enter the Address");
		String address = scanner.nextLine();

		System.out.println("Enter the City name");
		String city = scanner.nextLine();

		System.out.println("Enter the State");
		String state = scanner.nextLine();

		System.out.println("Enter the Pin");
		String zip = scanner.nextLine();

		System.out.println("Enter the Mobile Number");
		String mobileNumber = scanner.nextLine();

		System.out.println("Enter the Email Id");
		String email = scanner.nextLine();

		contact.setFirstName(firstName);
		contact.setLastName(lastName);
		contact.setAddress(address);
		contact.setCity(city);
		contact.setState(state);
		contact.setZip(zip);
		contact.setMobileNumber(mobileNumber);
		contact.setEmail(email);

	}

	public void display() {
		System.out.println(contact);
	}

	public void editContacts() {
		System.out.println("Enter the First Name of a person to edit:");
		String name = scanner.nextLine();

		if (name.equalsIgnoreCase(contact.getFirstName())) {
			addContact();
		} else {
			System.out.println("Invalid First Name \n Please enter Valid First name: ");
		editContacts();}

	}

}
