package com.cg.oops;

public class Cookie extends DesertItem {

	double totalcost;
	double totaltax;
	double finalamount;

	public void getCost() {

		double cookiecost = 1;
		System.out.println("Enter the quantity of cookie");
		int quantitycookie = sc.nextInt();
		double totalcost = quantitycookie * cookiecost;
		System.out.println("The total cost of candy is : " + totalcost);
		double tax = 0.12;
		totaltax = tax * totalcost;
		double finalAmt = totalcost + totaltax;
		finalamount = finalAmt * 70;
		System.out.println("The total amount in rupees is " + finalamount);


	}

	/*
	public void getTax() {

		

	}

	public void currencyConverter() {

		
	}
	*/

}
