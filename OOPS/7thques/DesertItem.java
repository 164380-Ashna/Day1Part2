package com.cg.oops;

import java.util.Scanner;

public abstract class DesertItem {

	static Scanner sc = new Scanner(System.in);

	abstract void getCost();

	//abstract void getTax();

	//abstract void currencyConverter();

	public static void addStorage() {

		Candy cnd=new Candy();
		Cookie ck=new Cookie();
		Icecream ice=new Icecream();
		
		int candy = 0;
		int cookie = 0;
		int icecream = 0;
		System.out.println("Enter the item that you want to add to the storage");
		System.out.println("1. candy");
		System.out.println("2. cookie");
		System.out.println("3. icecream");
		int choice = sc.nextInt();
		//System.out.println("Enter the quantity that you want to add to the storage: ");
		//int quantity = sc.nextInt();
		//for (int loop = 0; loop < quantity; loop++) {
			if (choice == 1) {
				cnd.getCost();
				

			} else if (choice == 2) {
				//cookie++;
				ck.getCost();

			} else if (choice == 3) {
				//icecream++;
				ice.getCost();

			} else {
				System.out.println("Something went wrong");

			}

		}
		//System.out.println("The quantity of candy is " + candy);
		//System.out.println("The quantity of cookie is " + cookie);
		//System.out.println("The quantity of icecream is " + icecream);

	

	public static void placeOrder() {

		int candy = 0;
		int cookie = 0;
		int icecream = 0;
		System.out.println("Enter the item that you want to add to the cart");
		System.out.println("1. candy");
		System.out.println("2. cookie");
		System.out.println("3. icecream");
		int choice = sc.nextInt();
		System.out.println("Enter the quantity that you want to add to the cart: ");
		int quantity = sc.nextInt();
		for (int loop = 0; loop < quantity; loop++) {
			if (choice == 1) {
				candy++;

			} else if (choice == 2) {
				cookie++;

			} else if (choice == 3) {
				icecream++;

			} else {
				System.out.println("Something went wrong");

			}

		}
		System.out.println("The quantity of candy is " + candy);
		System.out.println("The quantity of cookie is " + cookie);
		System.out.println("The quantity of icecream is " + icecream);

	}
	

	public static void main(String args[]) {
		System.out.println("Enter you role: ");
		System.out.println("Press 1. Owner");
		System.out.println("2. Customer ");

		int role = sc.nextInt();

		switch (role) {

		case 1:
			System.out.println("Welcome owner");
			// Code to be executed

		case 2:
			System.out.println("Welcome cutomer");
			// Code to be executed

		}

		if (role == 1) {
			addStorage();

		} else if (role == 2) {
			placeOrder();

		} else {
			System.out.println("Wrong choice entered by you");
		}
		
		
		
		
		

	}

}
