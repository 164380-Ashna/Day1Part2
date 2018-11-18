package com.cg.oops;

public class Candy extends DesertItem {

	double totalcost;
	double totaltax;
	double finalamount;

	public void getCost() {

		double candycost = 1;
		System.out.println("Enter the quantity of candy");
		int quantitycandy = sc.nextInt();
		totalcost = quantitycandy * candycost;
		System.out.println("The total cost of candy is : " + totalcost);
		double tax = 0.12;
		totaltax = tax * totalcost;
		double finalAmt = totalcost + totaltax;
		finalamount = finalAmt * 60;
		System.out.println("The total amount in rupees is " + finalamount);

	}

	/*
	public void getTax() {

		

	}

	public void currencyConverter() {

		

	}
	*/

}
