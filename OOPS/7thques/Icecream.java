package com.cg.oops;

public class Icecream extends DesertItem {

	double totalcost;
	double totaltax;
	double finalamount;

	public void getCost() {

		double icecreamcost = 1;
		System.out.println("Enter the quantity of icecream");
		int quantityicecream = sc.nextInt();
		double totalcost = quantityicecream * icecreamcost;
		System.out.println("The total cost of candy is : " + totalcost);
		double tax = 0.12;
		totaltax = tax * totalcost;
		double finalamount = totalcost + totaltax;
		System.out.println("The total amount in rupees is " + finalamount);

	}

	
	
	/*public void getTax() {

		

	}

	public void currencyConverter() {

		

	}
	*/

}
